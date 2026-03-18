package och12_gk;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Num
 */
@WebServlet("/Num")
public class Num extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Num() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html; charset=UTF-8");
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		PrintWriter out = response.getWriter();
		
		
		out.println("<html><body>");
		out.println("<h1>연산 결과</h1>");
		out.printf("덧셈 : " + num1 +" + "+ num2 + " = " + (num1+num2)+ "<br>");
		out.printf("뺄셈 : " + num1 +" - "+ num2 + " = " + (num1-num2)+ "<br>");
		out.printf("곱셈 : " + num1 +" x "+ num2 + " = " + (num1*num2)+ "<br>");
		out.printf("나눗셈 : " + num1 +" / "+ num2 + " = " + (num1/num2)+ "<br>");
		out.println("</body></html>");
		
		out.close();
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

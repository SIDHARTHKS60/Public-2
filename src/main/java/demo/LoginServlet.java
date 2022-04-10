package demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**                      
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name=request.getParameter("t1");
		String pwd=request.getParameter("p1");
		if((name.equals("admin"))&&(pwd.equals("admin")))	{
			request.setAttribute("institution","CDAC");
			RequestDispatcher r=request.getRequestDispatcher("Welcome");
			r.forward(request, response);}
		else {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		ServletContext context=getServletContext();
		String p1=(String)context.getAttribute("place1");
		String p2=(String)context.getAttribute("place2");
		
		out.println("Atrribute 1= "+p1);
		out.println("Atrribute 2= "+p2);
		out.println("Username or Password is incorrect");
		RequestDispatcher r=request.getRequestDispatcher("Login.html");
		r.include(request, response);}
		
	/*
	 * if(name.equals("admin")&&pwd.equals("admin")) { out.println("<html>");
	 * out.println("<head>"); out.println("<title> First Servlet</title>");
	 * out.println("</head>"); out.println("<body>");
	 * out.println("<b>Login Success!!!</b>"); out.println("Welcome"+name);
	 * out.println("</html>"); out.println("</body>");} else
	 * {response.sendError(403,"Invalid");}
	 */
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);}

}

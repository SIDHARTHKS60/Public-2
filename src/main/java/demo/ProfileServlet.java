package demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import javax.servlet.http.Cookie;

/**
 * Servlet implementation class ProfileServlet
 */
@WebServlet("/ProfileServlet")
public class ProfileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
public ProfileServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		RequestDispatcher rd=request.getRequestDispatcher("Link.html");
		rd.include(request, response);
		
		Cookie[] c=request.getCookies();
		String n="";
		if(c!=null){
			for(int i=0;i<c.length;i++) {
				if(c[i].getName().equals("ckvalue")){
					 n=c[i].getValue();
					 out.println("WELCOME"+n+"to CDAC");} }	}
		else {
			out.println("Please Login First.....");
			request.getRequestDispatcher("Login.html").include(request, response);}
		
		HttpSession s=request.getSession(false);
		if(s!=null) {
			out.println("Welcome to profile <br>");
			String n1=(String)s.getAttribute("attr");
			out.println(n1); }
		else  {
			out.println("Please, Login First....");
			request.getRequestDispatcher("Login.html").include(request, response); }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

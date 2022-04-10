package demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DisplayInfo
 */
//@WebServlet(name="Info",urlPatterns="/Display",initParams= {@WebInitParam(name="name",value="cdac"),@WebInitParam(name="email",value="stdc@cdac.in")})
public class DisplayInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	String servletName, name, email,webappname, course;
	ServletContext context;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayInfo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
		servletName=config.getServletName();
		name=config.getInitParameter("name");
		email=config.getInitParameter("email");
		
		context=config.getServletContext();
		webappname=context.getServletContextName();
		course=context.getInitParameter("course");
		
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
         
		out.println("<center>Servlet Name: "+servletName+"</center><br>");
		out.println("Name: "+name+"<br>");
		out.println("Email: "+email+"<br>");
		
		out.println("<hr><center>Web Application Name: "+webappname+"</center><br>");
		out.println("Course : "+course+"<br>");
		
		
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

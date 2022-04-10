package demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.PatientDAO;
import pojo.Patient;

/**
 * Servlet implementation class ViewServelet
 */
//@WebServlet("/ViewServlet")
public class ViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id=Integer.parseInt(request.getParameter("t1"));
		
		PatientDAO pd= new PatientDAO();
		Patient p=pd.viewPatient(id);
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		out.println("<table border='1'>");
		out.println("<tr>");
		out.println("<th>Ptid</th>");
		out.println("<th>PtName</th>");
		out.println("<th>PtAddr</th>");
		out.println("<th>Phno</th>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td>"+p.getPtid()+"</td>");
		out.println("<td>"+p.getPtname()+"</td>");
		out.println("<td>"+p.getPtaddr()+"</td>");
		out.println("<td>"+p.getPhno()+"</td>");
		out.println("</tr>");
		out.println("</table>");}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

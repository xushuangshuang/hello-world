package com.bodejidi.He;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class He extends HttpServlet
{
	static final String loginHtml =  "<html>\n"
					+ "<body>\n"
					+ "   <h1> login</h1>\n"
					+ "     <form action=\"\" method=\"POST\">\n"						
					+"   users: <input type = \"text\" name = \"username\"/>\n"
					+"   password: <input type = \"password\" name = \"password\"/>\n"
		  			+"	<input type = \"submit\" value = \"login\"/>\n"
				 	 +"  </form>\n"
					+"</body>\n"
					+"</html>\n";
	static final String loginfailHtml ="<html>\n"
					+ "<body>\n"
					+ "   <hi> error</hi>\n"
					+ "      <form action=\"\" method=\"GET\">\n"						
		  			+"     	<input type = \"submit\" value = \"back\"/>\n"
					 +"  </form>\n"
					+"</body>\n"
					+"</html>\n";

	static final String loginsuccessHtml ="<html>\n"
					+ "<body>"
					+ "   <hi> success</hi>\n"
					+ "   <form action=\"\" method=\"GET\">"						
			 		+"  </form>\n"
					+"</body>\n"
					+"</html>\n";

	public void doGet(HttpServletRequest req,
		       	HttpServletResponse resp)
			throws ServletException, java.io.IOException
		{
		        resp.setCharacterEncoding("UTF-8");
			resp.setContentType("text/html; charset=UTF-8");
			PrintWriter out = resp.getWriter();
			out.println(loginHtml);
	  	
		}	
	
	public void doPost(HttpServletRequest req,
			HttpServletResponse resp)
			throws ServletException, java.io.IOException
		{
			 resp.setCharacterEncoding("UTF-8");
			resp.setContentType("text/html; charset=UTF-8");
		       String username = req.getParameter("username");
		       String password = req.getParameter("password");
		       
		       if(username.equals("admin") && password.equals("123"))
		       {
		       		resp.getWriter().println(loginsuccessHtml);
		       }
		       else
		       {
			       resp.getWriter().println(loginfailHtml);
		       
		       }

	  	
		}	
}

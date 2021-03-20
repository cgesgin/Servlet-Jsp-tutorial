package _02.ServletConfig;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletConfig extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		
		 javax.servlet.ServletConfig config = getServletConfig();
		
		String name =config.getInitParameter("username");
		String pass =config.getInitParameter("password");
		
		resp.getWriter().print(name + " " +pass);
		
		String servletName = config.getServletName();
		ServletContext contex= config.getServletContext();
		Enumeration<String> nameParameters =config.getInitParameterNames();
		
		resp.getWriter().print("\nservlet name : "+servletName +" \ncontex:  "+contex +" \nnameparameters : "+ nameParameters);
	}
}

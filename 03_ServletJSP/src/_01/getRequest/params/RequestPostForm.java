package _01.getRequest.params;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/requestpost")
public class RequestPostForm extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name = req.getParameter("firstName");
		String surname = req.getParameter("latsName");
		String gender = req.getParameter("gender");
		String status = req.getParameter("marital status");
		String lang[] = req.getParameterValues("lang");
		
		resp.getWriter().print(name);
		resp.getWriter().print(surname);
		resp.getWriter().print(gender);
		resp.getWriter().print(status);
		resp.getWriter().print(Arrays.asList(lang));
	}
}

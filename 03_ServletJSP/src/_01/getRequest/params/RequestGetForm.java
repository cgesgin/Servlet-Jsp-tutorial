package _01.getRequest.params;

import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.util.ParameterMap;

@WebServlet("/requestget")
public class RequestGetForm extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
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
		
		Map<String, String[]> parameters =req.getParameterMap();
		
		for (Map.Entry<String, String[]> entry : parameters.entrySet()) {
			System.out.println(entry.getKey()+ " "+Arrays.asList(entry.getValue()));
		}
	}
}

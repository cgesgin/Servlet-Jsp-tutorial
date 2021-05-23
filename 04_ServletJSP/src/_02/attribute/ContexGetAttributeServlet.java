package _02.attribute;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/ContexGetAttributeServlet")
public class ContexGetAttributeServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		Integer is =(Integer)getServletContext().getAttribute("ContexAttribute");
		
		System.out.println(is);
		
	} 

}

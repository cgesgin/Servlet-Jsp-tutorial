package _01.helloServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet")
public class AnnotationServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println("Hello annotation servlet");
		PrintWriter pw =resp.getWriter();
		LocalTime localtime=LocalTime.now();
		pw.print("<h1>"+localtime+"</h1>");
		pw.print("Hello Annotation Servlet");
		
	}
}

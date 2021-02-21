package _01.helloServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalTime;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyfirstServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("Hello servlet ,doGet is called.");
		
		PrintWriter pw = resp.getWriter();
		LocalTime localtime = LocalTime.now();
		
		String message ="Hello Servlet";
		
		pw.print("<h1>"+localtime+"<h1>");
		pw.print("<h1>"+message+"<h1>");
		
		
	}
}

package _02.request.methods;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Locale;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/method")
public class RequestMethodsServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		Locale locale= req.getLocale();
		int port = req.getLocalPort();
		int serverPort = req.getServerPort();
		String remotePort= req.getRemoteAddr();
		ServletContext contex=  req.getServletContext();
		String hosName = req.getHeader("host");
		
		System.out.println(locale);
		System.out.println(port);
		System.out.println(serverPort);
		System.out.println(remotePort);
		System.out.println(contex);
		System.out.println(hosName);
		System.out.println("----------------------");
		Enumeration <String> headerNames= req.getHeaderNames();
		while (headerNames.hasMoreElements()) {
			String string = (String) headerNames.nextElement();
			String headerValue = req.getHeader(string);
			System.out.println(" "+headerValue);
		}
			
		
		
	}
}

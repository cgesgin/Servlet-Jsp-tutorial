package _02.implicit.objects;

import java.io.IOException;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ImplicitServlet")
public class ImplicitServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
		Cookie cookie = new Cookie("user", "admin");
		
		req.setAttribute("myAttribute", "request attribute");
		req.getSession().setAttribute("myAttribute", "session Attribute");
		
		RequestDispatcher dispatcher=req.getRequestDispatcher("ImplicitServlet.jsp");
		dispatcher.forward(req, resp);
	}
}

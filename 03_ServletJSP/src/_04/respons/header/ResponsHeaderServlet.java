package _04.respons.header;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ResponseHeaderServlet")
public class ResponsHeaderServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.addHeader("username", "test user1");
		resp.addHeader("username", "test user1");
		resp.setHeader("username", "test user3");
	}
}

package _03.ServletContex;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/contexServlet")
public class ServletContex extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		ServletContext contex =getServletContext();
		
		//alternatif kullaným
		ServletContext contex2 = getServletConfig().getServletContext();
		
		String info= contex.getInitParameter("rootPath");
		ServletConfig config = getServletConfig();
		
		String name = config.getInitParameter("name");//null deger donecektir Cünkü ilgili servlet tanýlanmamýstýr
		
		resp.getWriter().print(info + " " +name);
		
		String realPath =contex.getRealPath("/test.txt");
		System.out.println(realPath);
		
		String contexPath =contex.getContextPath();
		System.out.println(contexPath);
		
		String serverInfo = contex.getServerInfo();
		System.out.println(serverInfo);
		
	}
}

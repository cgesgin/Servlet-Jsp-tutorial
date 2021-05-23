package _03.response.encoding;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ResponseEncodingServlet")
public class ResponseEncodingServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//resp.setCharacterEncoding("UTF-8");//getWriter once yazılması gerkiyor
		//resp.setCharacterEncoding("ISO-8859-9");
		//resp.setContentType("text/html; charset=UTF-8");
		
		PrintWriter pw =resp.getWriter();
		String defaultEncoding=resp.getCharacterEncoding();//iso-8859
		
		System.out.print(defaultEncoding);
		
		
		pw.print("<html>");
		pw.print("<head> <meta charset='ISO-8859-9'> </head>");
		pw.print("<body>");		
		pw.println("içşğÜüŞ");
		pw.print("</body>");
		pw.print("</html>");
	}
	 
}

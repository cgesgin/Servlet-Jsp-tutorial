package _01.response;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/responseDownload")
public class ResponseDownloadServlet extends HttpServlet{
	
	
	
	@Override
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
		resp.setHeader("header1","value");
		
		resp.addHeader("header2","value-new");
		
		resp.setHeader("Content-Disposition", "attachment; filename=test.xlsx");
		
		 
		
		
		//*************tool kullanýmlarý ******************
		//		jexcel api 
		//		aphachi toi
		// 		java jasper report /pdf
		//		cristal report kullanýmý / ucretli
	}

}

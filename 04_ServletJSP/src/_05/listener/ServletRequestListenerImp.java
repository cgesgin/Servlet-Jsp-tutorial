package _05.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

@WebListener
public class ServletRequestListenerImp implements ServletRequestListener {

	@Override
	public void requestDestroyed(ServletRequestEvent sre) {
		System.out.println("ServletRequestListenerImp-------requestDestroyed-----");
		
	}

	@Override
	public void requestInitialized(ServletRequestEvent sre) {
		System.out.println("ServletRequestListenerImp-------requestInitialized-----");
		
		HttpServletRequest request=(HttpServletRequest) sre.getServletRequest();
		
		String path = request.getServletPath();
		String ip=request.getRemoteAddr();
		System.out.println(path+ " "+ip );
		
	}

}

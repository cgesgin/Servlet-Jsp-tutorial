package _01.lifecycle;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/lifecycle")
public class LifecycleServlet extends HttpServlet {

	@Override
	public void init() throws ServletException {
		
		//konfigurasyon kýsmý
		System.out.println("lifecycle#init()"); 

	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter pw = resp.getWriter();
		pw.print("Lifecycle doget is called");
		System.out.println("doget is called");
	}
	
	@Override
	public void destroy() {
		System.out.println("Destroying.......");
	}
}
/*Lifecycle
 * 1)container , servlet class dosyalarýný bulur
 * sonrasýnda laidng islemi yapýlýr
 * 
 * servletler ; 
 * 1-public olmak zorundadýr
 * 2-public no-arg consractur olmak zorundadýr.
 * 3-genel olarak servletlerde constructor tanýmlanmaz.
 * 4-constructor yerine init metodu tercih edilir.
 * 
 * 
 * 2)servlet initialize 
 * 
 * initialize mantiýgý bircok projede ihtiyazýmýz olacaktýr 
 * proje ayaga kalkarken ,istek karsýlanmadan once , ilgili serlet ilk defa calýsmadan once vs
 * bir kongfigurasyon yapmak isteriz bu mantýga ýnýtialize mantýgý denilebilir
 * 
 * public void init (ServletConfig config ) trows ServletException; 
 * 
 * public void init () trows ServletException {
 * }
 * 
 * init() metodu lifecycle boyunca bir kez calýsýr.
 * 
 * 3) servicing 
 * 
 * servlet objesi olustu 
 * servlet initialize olustu 
 * bu noktadan sonra artýk istekler karsýlanýr(handle reguest)
 * 
 * servce metodu override ETME!
 * 
 * gelen her istege karsýlýk bir tread olusur her servlet icin bir tane intance/olusur.
 * 
 * her istek -bir thread - bir tane obje 
 * 
 * 4-) doGet doPost metodu calýsýr.
 * 
 * 
 * 
 * 
 * */
 
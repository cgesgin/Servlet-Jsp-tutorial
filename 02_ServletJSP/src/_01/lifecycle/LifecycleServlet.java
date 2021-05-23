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
		
		//konfigurasyon k�sm�
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
 * 1)container , servlet class dosyalar�n� bulur
 * sonras�nda laidng islemi yap�l�r
 * 
 * servletler ; 
 * 1-public olmak zorundad�r
 * 2-public no-arg consractur olmak zorundad�r.
 * 3-genel olarak servletlerde constructor tan�mlanmaz.
 * 4-constructor yerine init metodu tercih edilir.
 * 
 * 
 * 2)servlet initialize 
 * 
 * initialize manti�g� bircok projede ihtiyaz�m�z olacakt�r 
 * proje ayaga kalkarken ,istek kars�lanmadan once , ilgili serlet ilk defa cal�smadan once vs
 * bir kongfigurasyon yapmak isteriz bu mant�ga �n�tialize mant�g� denilebilir
 * 
 * public void init (ServletConfig config ) trows ServletException; 
 * 
 * public void init () trows ServletException {
 * }
 * 
 * init() metodu lifecycle boyunca bir kez cal�s�r.
 * 
 * 3) servicing 
 * 
 * servlet objesi olustu 
 * servlet initialize olustu 
 * bu noktadan sonra art�k istekler kars�lan�r(handle reguest)
 * 
 * servce metodu override ETME!
 * 
 * gelen her istege kars�l�k bir tread olusur her servlet icin bir tane intance/olusur.
 * 
 * her istek -bir thread - bir tane obje 
 * 
 * 4-) doGet doPost metodu cal�s�r.
 * 
 * 
 * 
 * 
 * */
 
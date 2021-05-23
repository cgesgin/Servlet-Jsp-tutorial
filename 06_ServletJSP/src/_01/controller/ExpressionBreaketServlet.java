package _01.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/expressionBreaketServlet")
public class ExpressionBreaketServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Map<String ,String> map=new HashMap<String, String>();
		map.put("key1","value1");
		map.put("key2","value2");
		map.put("key3","value3");
		map.put("key4","value4");
		map.put("key5","value5");
		
		List<String> myList=new ArrayList<String>();
		
		myList.add("element1");
		myList.add("element2");
		myList.add("element3");
		
		req.setAttribute("myList", myList);
		
		RequestDispatcher rs=req.getRequestDispatcher("expressionBreaketLanguage.jsp");
		rs.forward(req, resp);
	}

}

package jspaction.controller;

import jspaction.model.Person;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/person")
public class PersonController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		Person person1=new Person("name1","surname1",5);
		 req.setAttribute("person1", person1);
		 //RequestDispatcher dispatcher=req.getRequestDispatcher("person.jsp");
		 RequestDispatcher dispatcher=req.getRequestDispatcher("personUseBean.jsp");
		 dispatcher.forward(req, resp);
	}
}

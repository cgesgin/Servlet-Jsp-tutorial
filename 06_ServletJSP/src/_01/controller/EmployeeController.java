package _01.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import _01.model.Department;
import _01.model.Employee;

@WebServlet("/employee")
public class EmployeeController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Department department1=new Department();
		department1.setId(100);
		department1.setName("IT");
		
		Employee employee1=new Employee();
		employee1.setId(1000);
		employee1.setName("ahmet");
		employee1.setSalary(5000);
		employee1.setDepartment(department1);
		
		req.setAttribute("employeeAttribute", employee1);
		
		//RequestDispatcher 	dispatcher=req.getRequestDispatcher("employee.jsp");
		//RequestDispatcher 	dispatcher=req.getRequestDispatcher("employeeUseBean.jsp");
		RequestDispatcher 	dispatcher=req.getRequestDispatcher("employeeExpressionLanguage.jsp");
		dispatcher.forward(req, resp);
	}
}

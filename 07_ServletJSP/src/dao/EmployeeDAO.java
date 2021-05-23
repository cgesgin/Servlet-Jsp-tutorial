package dao;

import java.util.List;

import model.Employee;

public interface EmployeeDAO {
	public void insert(String name,String surname, int salary);
	
	public List<Employee> getEmployees();
	
	public void removeEmployee(int id); 
}

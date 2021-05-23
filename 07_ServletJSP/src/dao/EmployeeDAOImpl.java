package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import model.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {

	private static final String INSERT_EMPLOYEE = "insert into tbl_employee(name,surname,salary) values(?,?,?)";
	private static final String ALL_EMPLOYEE = "select * from tbl_employee";
	private static final String DELETE_EMPLOYEE = " delete from tbl_employee where id=?";

	private DataSource getDataSource() {
		ConnectionManager manager = new ConnectionManager();
		DataSource dataSource = manager.getMySQLDataSource();
		return dataSource;
	}

	@Override
	public void insert(String name, String surname, int salary) {

		DataSource dataSource = this.getDataSource();
		Connection connection;
		try {
			connection = dataSource.getConnection();
			PreparedStatement ps = connection.prepareStatement(INSERT_EMPLOYEE);
			ps.setString(1, name);
			ps.setString(2, surname);
			ps.setInt(3, salary);
			ps.executeUpdate();
			connection.close();

		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

	@Override
	public List<Employee> getEmployees() {
		DataSource dataSource = this.getDataSource();
		List<Employee> employees = new ArrayList<Employee>();
		try {
			Connection connection = dataSource.getConnection();
			PreparedStatement ps = connection.prepareStatement(ALL_EMPLOYEE);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String surname = rs.getString("surname");
				int salary = rs.getInt("salary");

				Employee employee = new Employee(id, name, surname, salary);
				employees.add(employee);
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}
		return employees;
	}

	@Override
	public void removeEmployee(int id) {
		DataSource dataSource = this.getDataSource();
		Connection connection;
		try {
			connection = dataSource.getConnection();
			PreparedStatement ps = connection.prepareStatement(DELETE_EMPLOYEE);
			ps.setInt(1, id);
			ps.execute();
			ps.close();
			connection.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

}

package de.gre90r.jaxwsserver.employee;

import de.gre90r.jaxwsserver.employee.Employee;
import javax.jws.WebService;

@WebService
public class EmployeeService {

	public Employee getEmployeeById(String id) {

		Employee employee = new Employee("?", "unknown");
		
		if (id.equals("1")) {
			employee = new Employee("1", "Peter Zwegert");
		}
		else if (id.equals("2")) {
			employee = new Employee("2", "Jonathan Paul");
		}
		else if (id.equals("3")) {
			employee = new Employee("3", "Chris Dennis");
		}
		
		System.out.println("get " + employee.toString());
		return employee;
	}
}

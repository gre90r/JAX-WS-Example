package de.gre90r.jaxwsclient;

import de.gre90r.jaxwsserver.employee.Employee;
import de.gre90r.jaxwsserver.employee.EmployeeService;
import de.gre90r.jaxwsserver.employee.EmployeeServiceService;

public class Main {

	public static void main(String[] args) {
		
		EmployeeService webservice;
		try {
			System.out.println("get webservice");
			webservice = new EmployeeServiceService().getEmployeeServicePort();
		}
		catch (Exception e) {
			System.err.println("error: " + e.getMessage());
			return;
		}
		
		Employee employee;
		
		System.out.println("get employee with id 1");
		employee = webservice.getEmployeeById("1");
		System.out.println(String.format("received employee: id=%s, name=%s", employee.getId(), employee.getName()));
		
		System.out.println("get employee with id 2");
		employee = webservice.getEmployeeById("2");
		System.out.println(String.format("received employee: id=%s, name=%s", employee.getId(), employee.getName()));
		
		System.out.println("get employee with id 3");
		employee = webservice.getEmployeeById("3");
		System.out.println(String.format("received employee: id=%s, name=%s", employee.getId(), employee.getName()));
		
		System.out.println("get employee with id 4");
		employee = webservice.getEmployeeById("4");
		System.out.println(String.format("received employee: id=%s, name=%s", employee.getId(), employee.getName()));
	}
}
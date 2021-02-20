package de.gre90r.jaxwsserver.server;

import javax.xml.ws.Endpoint;

import de.gre90r.jaxwsserver.employee.EmployeeService;


public class Server {

	private static final String URL = "http://localhost:8080/employee-service";
	
	public static void main(String[] args) {
		
		try {
			Endpoint.publish(URL, new EmployeeService());
			System.out.println("Endpoint running... " + URL);
		}
		catch (Exception e) {
			System.err.println("Endpoint failed to start");
		}
	}
}

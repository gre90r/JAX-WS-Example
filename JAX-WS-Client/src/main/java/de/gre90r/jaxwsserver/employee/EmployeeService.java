
package de.gre90r.jaxwsserver.employee;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "EmployeeService", targetNamespace = "http://employee.jaxwsserver.gre90r.de/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface EmployeeService {


    /**
     * 
     * @param arg0
     * @return
     *     returns de.gre90r.jaxwsserver.employee.Employee
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getEmployeeById", targetNamespace = "http://employee.jaxwsserver.gre90r.de/", className = "de.gre90r.jaxwsserver.employee.GetEmployeeById")
    @ResponseWrapper(localName = "getEmployeeByIdResponse", targetNamespace = "http://employee.jaxwsserver.gre90r.de/", className = "de.gre90r.jaxwsserver.employee.GetEmployeeByIdResponse")
    @Action(input = "http://employee.jaxwsserver.gre90r.de/EmployeeService/getEmployeeByIdRequest", output = "http://employee.jaxwsserver.gre90r.de/EmployeeService/getEmployeeByIdResponse")
    public Employee getEmployeeById(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}
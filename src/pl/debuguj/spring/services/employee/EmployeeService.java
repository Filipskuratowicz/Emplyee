package pl.debuguj.spring.services.employee;

import pl.debuguj.spring.domain.Employee;

public interface EmployeeService {

	void addEmployee(Employee e);
	String showAllEmployees();

}

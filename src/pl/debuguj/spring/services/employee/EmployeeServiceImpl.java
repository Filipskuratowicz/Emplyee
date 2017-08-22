package pl.debuguj.spring.services.employee;

import java.util.ArrayList;
import java.util.List;

import pl.debuguj.spring.domain.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	private List<Employee> listEmployee = new ArrayList<Employee>();		
	
	
	@Override
	public void addEmployee(Employee e) {
		if(!listEmployee.contains(e)){
			this.listEmployee.add(e);
		}
		
	}


	@Override
	public String showAllEmployees() {
		StringBuilder sb = new StringBuilder();
		
		for(Employee e : listEmployee){
			sb.append(e.toString()).append("\n");
		}
		
		return sb.toString();
	}


}

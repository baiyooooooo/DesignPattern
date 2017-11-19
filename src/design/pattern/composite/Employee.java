package design.pattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	private String name;
	private String dept;
	private int salary;
	private List<Employee> subordinates;

	public Employee(String name, String dept, int salary) {
		this.name = name;
		this.dept = dept;
		this.salary = salary;
		this.subordinates = new ArrayList<Employee>();
	}

	public void addEmployee(Employee em) {
		this.subordinates.add(em);
	}

	public void removeEmployee(Employee em) {
		this.subordinates.remove(em);
	}

	public List<Employee> getSubordinates() {
		return this.subordinates;
	}

	public String toString() {
		return ("Employee :[ Name : " + this.name + ", dept : " + this.dept
				+ ", salary :" + this.salary + " ]");
	}
}

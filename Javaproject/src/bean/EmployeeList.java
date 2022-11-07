package bean;

import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeList {
	ArrayList<Employee> employeelist = new ArrayList<>();

	public void addemployee(Employee employee) {
		employeelist.add(employee);
	}

	public void removeemployeeid(int id, String name) {
		for (Iterator iterator = employeelist.iterator(); iterator.hasNext();) {
			Employee employee = (Employee) iterator.next();

			if ((employee.getId() == id || (employee.getName().equals(name)))) {
				iterator.remove();
			}
		}
	}

	public void showemployee() {
		for (Employee employee : employeelist) {
			System.out.println(employee.getId() + " " + employee.getName());

		}
	}

	public void getemployeebyname(String name) {
		for (Employee employee : employeelist) {
			if (employee.getName().equals(name)) {
				System.out.println(employee.getName() + " " + employee.getId());
			}

		}
	}

	public static void main(String[] args) {
		EmployeeList emp = new EmployeeList();
		Employee emp1 = new Employee("Saroja", 001, 9000);
		Employee emp2 = new Employee("Amu", 002, 8787);
		Employee emp3 = new Employee("Kurumathi", 003, 8765);
		Employee emp4 = new Employee("Karunya", 004, 6542);

		emp.addemployee(emp1);
		emp.addemployee(emp2);
		emp.addemployee(emp3);
		emp.addemployee(emp4);
		System.out.println();
		emp.removeemployeeid(001, "Saroja");
		System.out.println();
		emp.showemployee();
		emp.getemployeebyname("Karunya");

	}

}

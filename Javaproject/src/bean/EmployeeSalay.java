package bean;



import java.util.ArrayList;
	import java.util.Iterator;

	public class EmployeeSalay {
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
		public Employee highestSalay() {
			int maxValue = 0;
			Employee maxsal = null;
			for (Employee employee : employeelist) {
				if(employee.getSalary()>maxValue) 
					maxValue=employee.getSalary();
					maxsal=employee;
			
			}
			return maxsal;
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
			EmployeeSalay emp = new EmployeeSalay();
			Employee emp1 = new Employee("Saranya", 001, 1000);
			Employee emp2 = new Employee("Amutha", 002, 2000);
			Employee emp3 = new Employee("Kumutha", 003, 5000);
			Employee emp4 = new Employee("Kaviya", 004, 4000);

			emp.addemployee(emp1);
			emp.addemployee(emp2);
			emp.addemployee(emp3);
			emp.addemployee(emp4);
			System.out.println();
			emp.removeemployeeid(001, "Saranya");
			System.out.println();
			emp.showemployee();
			emp.getemployeebyname("Kaviya");
			System.out.println(emp.highestSalay().getName()+emp.highestSalay().getId());

		}

	
}

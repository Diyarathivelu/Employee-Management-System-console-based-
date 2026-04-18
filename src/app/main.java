package app;
import service.employeeService;
public class main {
	public static void main(String[]args) {
		employeeService emp=new employeeService();
		emp.start();
	}
}

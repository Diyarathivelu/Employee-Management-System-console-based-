package service;
import java.util.HashSet;
import java.util.Scanner;
import Model.employee;
import repository.employeeRepository;
public class employeeService {
	employeeRepository er=new employeeRepository();
	Scanner scn =new Scanner(System.in);
	
	
					public void start() {
						while(true) {
							System.out.println("Welcome to Employee Management System");
							System.out.println("1.Add Employee/n 2.View Employees /n3.Update Employee /n4.Delete Employee /n 5.Find Employee /n 6.View Total Employees /n 7.Exit");
							int choice=scn.nextInt();
							switch(choice) {
							case 1: addEmployee();
									break;
							case 2: viewAllEmployee();
									break;
							case 3: updateEmployee();
									break;
							case 4: deleteEmployee();
									break;
							case 5: findEmployee();
									break;
							case 6:countEmployee();
								   break;
							case 7:System.out.println("Exiting.....");
									return;
							default:System.out.println("Invalid Choice");;
									break;
							}
						}
					
					}
//					Adding employee
					private void addEmployee() {
						int EmployeeId;
						String EmployeeName;
						String EmployeeDes;
						String EmployeeDept;
						int Empsal;
						while(true) {
							System.out.println("Enter Employee Id:");
							EmployeeId=scn.nextInt();
							if(EmployeeId>0) {
								break;
							}else {
								System.out.println("Employee number Should be positive");
							}
						}
						while(true) {
							System.out.println("Enter Employee Name:");
							EmployeeName=scn.next();
							if(EmployeeName.matches("[a-zA-Z]+")) {
								break;
							}
							else {
								System.out.println("Employee Name is Inappropriate");
							}
						}
						while(true) {
							System.out.println("Enter your Employee Desgination:");
							EmployeeDes=scn.next();
							if(EmployeeDes.matches("[a-zA-Z]+")) {
								break;
							}
							else {
								System.out.println("Enter Valid Employee Designation");
							}
						}
						while(true) {
							System.out.println("Enter your Employee Department:");
							EmployeeDept=scn.next();
							if(EmployeeDept.matches("[a-zA-Z]+")) {
								break;
							}else {
								System.out.println("Enter Valid Department Name");
							}
						}
						while(true) {
							System.out.println("Enter the Employee Salary");
							Empsal=scn.nextInt();
							if(Empsal>0) {
								break;
							}
							else {
								System.out.println("Enter the  valid Employee Salary");
							}
						}
						employee emp=new employee(EmployeeId,EmployeeName,EmployeeDes,EmployeeDept,Empsal);
						boolean added=er.addEmployee(emp);
						if(added) {
							System.out.println("Employee Added successfully!!!!!!....");
							}
						else {
							System.out.println("Employee Id already Exists");
						}
					}
//					viewing all employees
					private void viewAllEmployee() {
						
						String tablevalues=er.viewEmployees();
						System.out.println(tablevalues);
					}
//					updateEmployee
					private void updateEmployee() {
						System.out.println("Enter the Employee Id");
						int id=scn.nextInt();
						System.out.println("Enter the Employee Name:");
						String name=scn.next();
						System.out.println("Enter the Employee Designation:");
						String empdes=scn.next();
						System.out.println("Enter the Employee Department");
						String empdept=scn.next();
						System.out.println("Enter the Employee Salary");
						int sal=scn.nextInt();
						boolean updated=er.updateEmployee(id, name, empdept, empdes, sal);
						if(updated) {
							System.out.println("Employee details are updated");
						}
						else {
							System.out.println("Employee Id not found");
						}
						
					}
//					counting all employees
					private void countEmployee() {
							int value=er.countEmployeeSize();
							System.out.println("Total number of Employee in the company is "+value);
					}
//					Delete an employee
					private void deleteEmployee() {
							System.out.println("Enter the Employee Id to be Deleted:");
							int id=scn.nextInt();
							boolean deleted=er.deleteEmployee(id);
							if(deleted) {
								System.out.println("The Employee Data has been Deleted");
							}
							else {
								System.out.println("Employee Id not found");
							}
					}
////					finding an employee
					private void findEmployee() {
							System.out.println("Enter the Employee Id:");
							int id=scn.nextInt();
							String e=er.findEmployeeId(id);
							if(e!=null) {
								System.out.println(e);
							}else {
								System.out.println("Employee Id not found");
							}
							
					}
//
}

package Model;

public class employee {
	int empId;
	String employeeName;
	String employeeDept;
	String employeeDesignation;
	int employeeSalary;
//	constructor 
	public employee(int empId,String employeeName,String employeeDept,String employeeDesignation,int employeeSalary)
	{
		this.empId=empId;
		this.employeeName=employeeName;
		this.employeeDept=employeeDept;
		this.employeeDesignation=employeeDesignation;
		this.employeeSalary=employeeSalary;
		
	}
//	getters
	public int getempId() {
		return this.empId;
	}
	public String getemployeeName() {
		return this.employeeName;
	}
	public String getemployeeDept() {
		return this.employeeDept;
	}
	public String getemployeeDesignation() {
		return this.employeeDesignation;
		
	}
	public int getemployeeSalary() {
		return this.employeeSalary;
		
	}
	
//setters
	public String setemployeeName(String newemployeeName) {
		return this.employeeName=newemployeeName;
	}
	public String setemployeeDept(String newemployeeDept) {
		return this.employeeDept=newemployeeDept;
	}
	public String setemployeeDesignation(String newemployeeDesignation) {
		return this.employeeDesignation=newemployeeDesignation;
		
	}
	public int setemployeeSalary(int newemployeeSalary) {
		return this.employeeSalary=newemployeeSalary;
		
	}
	
	@Override
	public String toString() {
		return empId+"|"+employeeName+'|'+employeeDesignation+"|"+employeeSalary+"|"+employeeDept;
	}

}

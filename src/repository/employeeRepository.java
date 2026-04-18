package repository;
import Model.employee;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import util.Dbconnection;

public class employeeRepository {
	
	
						//	Adding Employeee
						public boolean addEmployee(employee e) 
							{
								try {
									Connection c1=Dbconnection.getConnection();
									
									PreparedStatement check=c1.prepareStatement("Select * from employeetable where empId=?");
									check.setInt(1,e.getempId());
									ResultSet rs=check.executeQuery();
									if(rs.next()) {
										return false;
									}else {
										PreparedStatement ps=c1.prepareStatement("Insert  into employeetable values(?,?,?,?,?)");
										ps.setInt(1,e.getempId());
										ps.setString(2,e.getemployeeName());
										ps.setString(3,e.getemployeeDesignation());
										ps.setString(4,e.getemployeeDept());
										ps.setInt(5,e.getemployeeSalary());
										int rows=ps.executeUpdate();
										return rows>0;
									}
								}
								catch(Exception Ex){
									Ex.printStackTrace();
								}
								return false;
								}

						
						//	viewing all employees
						 public String viewEmployees() {
							 StringBuilder str=new StringBuilder();
							 try {
								 Connection c1=Dbconnection.getConnection();
								 Statement s1= c1.createStatement();
								 ResultSet rs=s1.executeQuery("select * from  employeetable");
								 while(rs.next()) {
									 str.append( rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getInt(5)+"\n");
								 }
								 rs.close();
								 s1.close();
								 c1.close();
								
							 }catch(Exception e){
								 e.printStackTrace();
								 
							 }
							 return str.toString();
						 }
						 
						 
						 //	 find Employee
						 public String findEmployeeId(int id) {
							 try {
								 Connection c1=Dbconnection.getConnection();
								 PreparedStatement p1=c1.prepareStatement("Select * from employeetable where empId=?");
								 p1.setInt(1,id);
								 ResultSet rs=p1.executeQuery();
								 if(rs.next()) {
									return "ID: "+rs.getInt("empId")+"  NAME :"+rs.getString("empName")+" DEPARTMENT: "+rs.getString("empDept")+" DESIGNATION: "+rs.getString("empdes")+" SALARY: "+rs.getInt("empSal");
								 }
								 
								 
							 }catch(Exception e) {
								 e.printStackTrace();
							 }
							 return null;
						 }
						 // Delete an Employee
						 public boolean deleteEmployee(int id) {
							 try {
								 Connection c1=Dbconnection.getConnection();
								 PreparedStatement p1=c1.prepareStatement("Delete from employeetable where empId=?");
								 p1.setInt(1, id);
								 int rows=p1.executeUpdate();
								 return rows>0;
							 }catch(Exception e) {
								 e.printStackTrace();
							 }
							 return false;
						 }
						 //Update Employee
	 
							 public boolean updateEmployee(int id,String name,String dept,String des,int sal)
							 {
								 
								try {
									Connection c1=Dbconnection.getConnection();
									PreparedStatement p1=c1.prepareStatement("update employeetable set empName=?,empDept=?,empDes=?,empsal=? where empId=?");
									p1.setString(1,name);
									p1.setString(2,dept);
									p1.setString(3, des);
									p1.setInt(4, sal);
									p1.setInt(5,id);
									
									int rows=p1.executeUpdate();
									return rows>0;
									
								}
								catch(Exception e){
									e.printStackTrace();
									
								}
								return false;
							 }
						 
						 
					 //	Total count
		 					 public int countEmployeeSize() {
								 try {
									 Connection c1=Dbconnection.getConnection();
									 Statement s1= c1.createStatement();
									 ResultSet rs=s1.executeQuery("Select COUNT(*)from employeetable");
									 if(rs.next()) {
									 return  rs.getInt(1);
									 }
								 }
								 catch(Exception e){
									 e.printStackTrace();
									 
								 }
								 return 0;
							 }

}

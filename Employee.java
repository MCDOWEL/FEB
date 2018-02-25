package Nitin;

public class Employee {
private	int Empid; 
private	int age;
private	double salary;
private	String name;
public int getEmpid() {
	return Empid;
}
public void setEmpid(int empid) {
	Empid = empid;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Employee(int empid, int age, double salary, String name) {
	super();
	Empid = empid;
	this.age = age;
	this.salary = salary;
	this.name = name;
}
public Employee()
{
	
}

	

}

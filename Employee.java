
public abstract class Employee extends Person {
private double salary;
private String company;
public Employee() {}

public Employee(String name, String surname, int id, double age, double salary, String company) {
	super(name, surname, id, age);
	this.salary = salary;
	this.company = company;
}

public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	if(salary >= 0) this.salary = salary;
}
public String getCompany() {
	return company;
}
public void setCompany(String company) {
	if(company != null)this.company = company;
}

@Override
public String toString() {
	
	return super.toString() + ", Salary: " + this.salary + ", Company: " + company;
}
public abstract double salary();

}

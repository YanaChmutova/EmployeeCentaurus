
public class WageEmployee extends Employee {
	private double hours;
	private double wage;
	public double getHours() {
		return hours;
	}
	public void setHours(double hours) {
		if(hours>=0)this.hours = hours;
	}
	public double getWage() {
		return wage;
	}
	public void setWage(double wage) {
		if (wage>=0)this.wage = wage;
	}
	public WageEmployee() {}
	public WageEmployee(String name, String surname, int id, double age, double salary, String company, double hours,
			double wage) {
		super(name, surname, id, age, salary, company);
		if(hours>=0)this.hours = hours;
		if (wage>=0)this.wage = wage;
	}
	@Override
	public String toString() {
		
		return super.toString() + " Hours: " + hours + " Wage: " + wage;
	}
	@Override
	public double salary() {
	double sal = hours * wage;
		return sal;
	}
	
}

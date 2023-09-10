
public class SalesMan extends Employee {
private double totalSales;
private double bonus;
public SalesMan() {}
public SalesMan(String name, String surname, int id, double age, double salary, String company, double totalSales,
		double bonus) {
	super(name, surname, id, age, salary, company);
	if (totalSales>=0)this.totalSales = totalSales;
	if (bonus>=0)this.bonus = bonus;
}
public double getTotalSales() {
	return totalSales;
}
public void setTotalSales(double totalSales) {
	if (totalSales>=0)this.totalSales = totalSales;
}
public double getBonus() {
	return bonus;
}
public void setBonus(double bonus) {
	if(bonus>=0)this.bonus = bonus;
}
@Override
public String toString() {

	return super.toString() + "  Total sales: " + totalSales + "  Bonus: " + bonus;
}
@Override
public double salary() {
	double bn = (totalSales * bonus)/100;
	double sal = super.getSalary() + bn;
	return sal;
}

}

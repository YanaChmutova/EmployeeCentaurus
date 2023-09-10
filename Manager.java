
public class Manager extends Employee {
private int team;
private int level;
public int getTeam() {
	return team;
}

public Manager() {}

public Manager(String name, String surname, int id, double age, double salary, String company, int team, int level) {
	super(name, surname, id, age, salary, company);
	if(team>=0)this.team = team;
	if(level>=1 && level <=4)this.level = level;
}

public void setTeam(int team) {
	if(team>=0)this.team = team;
}
public int getLevel() {
	return level;
}
public void setLevel(int level) {
	if(level>=1 && level<=4)this.level = level;
}

@Override
public String toString() {
	return super.toString() + "  Team: " + team + "  Level: " + level;
}

@Override
public double salary() {
double sal = super.getSalary() * level;
	return sal;
}

}

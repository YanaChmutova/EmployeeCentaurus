//Object
public class Person {
	//this
	//fields
	private String name;
	private String surname;
	private int id;
	private double age;
	
	// default constructor
	public Person() {} 
	
	//custom constructor
	public Person(String name, String surname, int id, double age) {
		if(name!= null) this.name = name;
		if(surname != null) this.surname = surname;
		if(id > 0) this.id = id;
		if(age> 0) this.age = age;
	}
	
	//setters
	public void setName(String name) {
		if (name!=null)
			this.name = name;
	}
	public void setSurname(String surname) {
		if(surname != null)
			this.surname = surname;
	}
	public void setId(int id) {
		if(id>0)
			this.id = id;
		}
	public void setAge(double age) {
		if(age>0)
			this.age = age;
	}
	//getters
	public String getName() {
		return name;
	}
	public String getSurname() {
		return this.surname;
	}
	public int getID() {
		return id;
	}
	public double getAge() {
		return age;
	}
	@Override
	public String toString() {
		String str = "Name: " + name + ",  Surname: " + this.surname + ",  ID: " + id + ", Age: " + age;
		return str;
	}
	
	}

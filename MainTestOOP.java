
public class MainTestOOP {

	public static void main(String[] args) {
	Person p1 = new Person();
	p1.setName("Haim");
	p1.setSurname("Cohen");
	p1.setId(1234);
	p1.setAge(25.5);
	System.out.println(p1.getID());
	System.out.println(p1);
//	String str = p1.toString();
//	System.out.println(str);
	Person p2 = new Person("Rivka", "Cohen", 4321, 22.5);
	System.out.println(p2);
	
//	Employee emp = new Employee("Tanya", "Petrova", 23456, 35, 20000, "Google");
//	System.out.println(emp);  abstraktniy class!
	
	Manager mn = new Manager("Vitaly", "Ivanov", 9667, 48.5, 9000, "IBM", 25, 2);
	System.out.println(mn);
	System.out.println("Salary: " + mn.salary() + " nis");
	SalesMan cm = new SalesMan("Olga", "Mizrahi", 6468, 34.5, 5000, "IBM", 1000000, 1.5);
	System.out.println(cm);
	System.out.println("Salary: " + cm.salary() + " nis");
	WageEmployee we = new WageEmployee("Ioosi", "Petrov", 26490, 52.5, 0, "IBM", 182, 38);
	System.out.println(we);
	System.out.println("Salary: " + we.salary() + " nis");
	Centaurus cn = new Centaurus();
	cn.setName("Anatoly");
	cn.setSurname("Gol");
	cn.setId(6543);
	cn.setAge(235);
	System.out.println(cn);
	cn.toJump();
	}

}
/*
 
p1 -> [name="Haim" surname = "Cohen" id = 1234 age = 2455] 

*/
  
/*  Object
 * toString()
 *    |
    Person
 -----------
name(String)
surname(String)
id(int)
age(double)
 |
Employee
--------
salary(double)
company(String)
|                   |                    |
Manager         Salesman            WageEmployee
--------        ---------          --------------
team(int)      totalSales(double)   hours(double)
level(int)     bonus (double)       wage(double)

Homework:

Car toString()
--------
model(String)
year(int)
engine(double)
color(String)
 |
Truck toString()
------
  maxWeigth(double)
  maxHeigth (double)
  
  
Book toString()
------
author(String)
title(String)
pages(int)
ISBN(long)
 | 
LibraryBook toString()
----------
getNumber(int)
libraryName(String)

                flying
                ------
                maxH
                maxD
      |          |          |
   Airplane    Bird      Ballon
   --------    ----      ------
   
            |
   
   
*/

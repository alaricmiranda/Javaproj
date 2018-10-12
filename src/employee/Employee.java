package employee;

public class Employee {
public double sal,Fsal;
public int id;
public String name;
final double tax=0.25;
public Employee(int id,String name,double sal)
{
	this.id=id;
	this.name=name;
	this.sal=sal;
	Fsal=(sal-(sal*tax));
	}
}

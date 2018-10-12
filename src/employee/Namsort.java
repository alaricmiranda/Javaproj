package employee;

import java.util.Comparator;

public class Namsort implements Comparator<Employee> {
	public int compare(Employee s1,Employee s2)
	{
		return s1.name.compareTo(s2.name);
		}

}

package employee;

import java.util.Comparator;

public class Salsort implements Comparator<Employee> {
	public int compare(Employee s1,Employee s2)
	{
		if(s1.sal==s2.sal)
			return 0;
		else if(s1.sal>s2.sal)
			return 1;
		else
			return -1;
		}

}

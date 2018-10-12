package employee;
import java.util.Comparator;

public class Idsort implements Comparator<Employee> {
public int compare(Employee s1,Employee s2)
{
	if(s1.id==s2.id)
		return 0;
	else if(s1.id>s2.id)
		return 1;
	else
		return -1;
	}
}

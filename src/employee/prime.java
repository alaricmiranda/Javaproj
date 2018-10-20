package employee;
import java.util.Scanner;
public class prime {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("prime numbers from 1-100");
	for(int n=1;n<101;n++)
	{
	boolean p=true;
	if(n<=1)
		p=false;
	else
	{
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				p=false;
				break;
			}
		}
	}
if(p)
	System.out.println(n+" is prime");

	}
	}
}

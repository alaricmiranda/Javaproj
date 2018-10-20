package employee;

import java.util.Scanner;
import java.lang.Math;

public class amstrong {

	public static void main(String[] args) {
	int n;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter numer to be checked");
	n=sc.nextInt();
	int t=n;
	int c=0;
	int m=0;
	while(t>0)
	{
		t=t/10;
		c++;
	}
	System.out.println(c);
	t=n;
	while(t>0)
	{
		int a=t%10;
		t=t/10;
		m=(int)(m+Math.pow(a,c));
	}
	if(m==n)
		System.out.println("amstrong no");
	else
		System.out.println("not amstrong");

}
}

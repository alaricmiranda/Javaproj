package employee;

import java.util.Scanner;

public class pallindrome {
	public static void main(String[] args) {
		String o,t="";
	Scanner sc=new Scanner(System.in);
	System.out.println("enter numer/string to be checked");
	o=sc.next();
	int l=o.length();
	for(int i=l-1;i>=0;i--)
	{
		t=t+o.charAt(i);
	}
	if(o.equals(t))
		System.out.println("palllindrome");	
	else
		System.out.println("not palllindrome");	
	}

}

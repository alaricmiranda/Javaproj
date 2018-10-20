package employee;
import java.util.Scanner;;
public class Dbmain {
	public static void main(String[] args) 	
		{ 
		Scanner sc=new Scanner(System.in);
		System.out.println("Desiren amount of numbers");
		int n=sc.nextInt();
		int ar[]=new int[n];
		int i;
		for(i=0;i<n;i++)
		{
		System.out.println("Enter number"+(i+1));
		ar[i]=sc.nextInt();
		}
		int ref=0;
		for(i=0;i<n;i++)
		{
		ref=(ref>ar[i])? ref:ar[i];
		}
		System.out.println("largest number="+ref);
		for(i=0;i<n;i++)
		{
		ref=(ref<ar[i])? ref:ar[i];
		}
		System.out.println("smallest number="+ref);
		
		
		}
	}
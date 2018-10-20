package employee;

public class binary {

	public static void main(String[] args) {
		int ar[]= {1,2,4,5,8,9,15,32,11};
		int u=ar.length-1;
		int x=32,m,l=0,f=0;
		
		while(l<=u)
		{
			m=(l+u)/2;
			System.out.println(m);
			if(ar[m]==x)
			{
				System.out.println("number is at loc:"+m);
				f=1;
				break;
			}
			else if(ar[m]<x)
			{
				l=m+1;
			}
			else if(ar[m]>x)
			{
				u=m-1;
			}
			System.out.println(l+" n "+u);
		}
		if(f==0)
			System.out.println("no not in array");
	}
	

}

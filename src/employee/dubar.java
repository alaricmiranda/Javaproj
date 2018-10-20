package employee;
public class dubar {

	public static void main(String[] args) {
		int ar[]= {0,1,12,1,0,66,5,15,12,5,1};
		int l=ar.length;
		int ar1[]=new int[l];
		int c=0;
		int f=0;
		for(int i=0;i<l;i++)
		{
			c=1;
			for(int j=i+1;j<l;j++)
			{
				if(ar[i]==ar[j])
				{
					for(int x=j+1;x<l;x++)
					{
					ar[x-1]=ar[x];
					}
					c++;
					f++;
					l--;
				}
				
			}
			for(int y=0;y<l;y++)
			{
				System.out.print(" "+ar[y]);
				}
			System.out.println("the number:"+ar[i]+"is repeated:"+c+"times");
		}
		System.out.println("Total number of dublicates"+f);

	}

}

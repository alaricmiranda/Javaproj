package employee;

public class dublicate {
	public static void main(String[] args)
	{
		String s="i am a human being";
		int n=s.length();
		char ar[]=s.toCharArray();
		for(int i=0;i<n;i++)
		{
			if(ar[i]!=' ')
			{
				int c=1;
				for(int j=i+1;j<n;j++)
				{
					if(ar[i]==ar[j])
					{
						ar[j]=' ';
						c++;
					}
					
				}
				System.out.println("The character:"+ar[i]+" was repeated:"+c+"time's");
			}
		}
	}
}

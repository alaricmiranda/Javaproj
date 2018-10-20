package employee;

public class Nwords {
	public static void main(String[] args) 	
	{
		int c=1;
		String s="i am a Dog";
		int n=s.length();
		for(int i=0;i<n;i++)
		{
			if((s.charAt(i)==' ')&& (s.charAt(i+1)!=' '))
				c++;
		}
		System.out.println("no of words ="+c);
		char arr[]=s.toCharArray();
		for(int i=0;i<n;i++)
		{
			if((arr[i]==' ')&& (arr[i+1]!=' '))
			arr[i+1]=Character.toUpperCase(arr[i+1]);
		}
		arr[0]=Character.toUpperCase(arr[0]);
		String f=new String(arr);
		System.out.println(f);
	}
	
}

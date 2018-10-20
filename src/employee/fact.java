package employee;

public class fact {
	public static void main(String[] args) {
	System.out.println("Factorial from  1-10");
	int fact;
	for(int n=1;n<11;n++)
	{
	int s=n;
	for(fact=n;fact>1;--fact)
				{
					s=(s*(fact-1));
					
				}
    System.out.println("Factorial of:"+n+"is"+s);
	}
	}

}

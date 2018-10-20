import java.util.*; 
class test
{ 
public static void main(String args[]) 
{ 
int n;
int m;
for(n=1;n<11;n++)
{
	System.out.println("Multiplicaton table of:"+n);
	for(m=1;m<11;m++)
	{
		System.out.println(n+"x"+m+"="+(n*m));
		}
	System.out.println("------------------------------");
	}
}
}
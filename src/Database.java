import employee.*;
import java.util.*;


public class Database {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Hello");
		System.out.println("building database");
		ArrayList<Employee> emp=new ArrayList<Employee>();
		emp.add(new Employee(110,"Alex",3000));
		emp.add(new Employee(101,"Malon",1500));
		emp.add(new Employee(100,"Shaggy",15000));
		emp.add(new Employee(115,"Baron",100));
		Collections.sort(emp,new Namsort());
		int id;
		double sal;
		String name;
		System.out.println("Displaying Database");
		System.out.println("-------------------------------------------------------");
		for(Employee em:emp)
		{
			System.out.println("Employee Id="+em.id+" Name="+em.name+" Sal"+em.sal+" Taxed amount"+em.Fsal);
		}
		System.out.println("-------------------------------------------------------");
		int end=1;
		do
		{
		System.out.println("Modify Datbase");
		System.out.println("1.Resort");
		System.out.println("2.Update existing");
		System.out.println("3.Add new entry");
		int c=sc.nextInt();
		switch(c)
		{
		case 1:
		{
			System.out.println("Resort accodring to?");
			System.out.println("1.Name");
			System.out.println("2.ID");
			System.out.println("3.Salary");
			int r=sc.nextInt();
			switch (r)
			{
			case 1:
			{
				Collections.sort(emp,new Namsort());
				break;
			}
			case 2:
			{
				Collections.sort(emp,new Idsort());
				break;
			}
			case 3:
			{
				Collections.sort(emp,new Salsort());
				break;
			}
			default:
				System.out.println("Invalid");

				
			}
			System.out.println("Resorted Databse");
			System.out.println("-------------------------------------------------------");
			for(Employee em:emp)
			{
				System.out.println("Employee Id="+em.id+" Name="+em.name+" Sal="+em.sal+" Taxed amount="+em.Fsal);
			}
			System.out.println("-------------------------------------------------------");
			break;
		}
		case 2:
		{
			System.out.println("Enter Id to update");
			int idm=sc.nextInt();
			int f=0;
			ListIterator itr=emp.listIterator();
			while(itr.hasNext())
			{
				Employee st=(Employee)itr.next();
				if(st.id==idm)
				{
					 f=1;
					System.out.println("Entry is");
					System.out.println("Employee Id="+st.id+" Name="+st.name+" Sal="+st.sal+" Taxed amount="+st.Fsal);
					System.out.println("Do u want to?");
					System.out.println("1.Delete");
					System.out.println("2.update");
					int m=sc.nextInt();
					if(m==1)
						itr.remove();
					else if(m==2)
					{
						System.out.println("Enter updated information");
						System.out.println("Id=");
						id=sc.nextInt();
						System.out.println("Name=");
						name=sc.next();
						System.out.println("Slary is=");
						sal=sc.nextInt();
						//itr.set(id,name,sal); not working using remove and adding new entry
						itr.remove();
						emp.add(new Employee(id,name,sal));
					}
					System.out.println("Updated");
					System.out.println("-------------------------------------------------------");
					for(Employee em:emp)
					{
						System.out.println("Employee Id="+em.id+" Name="+em.name+" Sal="+em.sal+" Taxed amount="+em.Fsal);
					}
					System.out.println("-------------------------------------------------------");
					}
				}
			if(f==0)
				System.out.println("Not fouund");
			break;
			}
		case 3:
		{
			System.out.println("Enter updated information");
			System.out.println("Id=");
			id=sc.nextInt();
			System.out.println("Name=");
			name=sc.next();
			System.out.println("Slary is=");
			sal=sc.nextInt();
			emp.add(new Employee(id,name,sal));
			System.out.println("Updated Databse");
			System.out.println("-------------------------------------------------------");
			for(Employee em:emp)
			{
				System.out.println("Employee Id="+em.id+" Name="+em.name+" Sal="+em.sal+" Taxed amount="+em.Fsal);
			}
			System.out.println("-------------------------------------------------------");
			break;
		}
		default:
			System.out.println("invalid");
		}

 System.out.println("enter 1 to continue or 2 to exit");
 end=sc.nextInt();
		
}while(end==1);
}
}


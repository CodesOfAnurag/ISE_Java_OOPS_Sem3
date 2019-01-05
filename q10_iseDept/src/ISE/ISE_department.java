package ISE;

import java.util.Scanner;

public class ISE_department extends Faculty implements Department {
	Faculty fac[];
	Scanner sc = new Scanner(System.in);
	public ISE_department(int n)
	{
		fac=new Faculty[n];
		for (int i=0; i<n;i++)
		{
			fac[i]=new Faculty();
		}		
	}
	
	public void printdata()
	{
		for (int i=0; i<fac.length;i++)
		{
			System.out.println("--------------------------------------------");
			System.out.println("Name : "+fac[i].name);
			System.out.println("Designation : "+fac[i].designation);
			System.out.println("subjects_handled : "+fac[i].subjects_handled);
			try 
			{
				if (fac[i].age>58)	throw new AgeException("Above 58");
				else 		System.out.println("Age : "+fac[i].age);
			}
			catch(AgeException e)
			{
				System.out.println(e);
			}
			finally
			{
				System.out.println("experience : "+fac[i].exp);
				System.out.println("Joining date : "+fac[i].join_date);
				print_number_designation(fac[i]);
				number_research_consultancy_projs(fac[i]);
				System.out.println("--------------------------------------------");
			}
		}
	}
	
	public void readdata()
	{
		for (int i=0; i<fac.length; i++)
		{
			System.out.println("Detail - "+(i+1));
			System.out.print("Name : ");
			fac[i].name=sc.next();
			System.out.print("Designation : ");
			fac[i].designation=sc.next();
			System.out.print("subjects_handled : ");
			fac[i].subjects_handled = sc.nextInt();
			System.out.print("Age : ");
			fac[i].age=sc.nextInt();
			System.out.print("experience : ");
			fac[i].exp=sc.nextInt();
			System.out.print("Joining date : ");
			fac[i].join_date=sc.nextInt();
		}
	}

	public void print_number_designation(Faculty f1)
	{
		if (f1.exp>20)	System.out.println("Held more than 10 post");
		else 			System.out.println("Held less than 10 post");
	}
	
	public void number_research_consultancy_projs(Faculty f1)
	{
		if (f1.exp>30)	System.out.println("Had more than 10 Research");
		else 			System.out.println("Had less than 10 Research");
	}
	
	
}

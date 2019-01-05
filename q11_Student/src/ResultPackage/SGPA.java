package ResultPackage;
import StudentPackage.*;
import java.util.*;
public class SGPA extends RegisterStudent 
{
	public float marks[];
	public int gpa[];
	public float sgpa;
	public Scanner scr = new Scanner(System.in);
	public SGPA()
	{
		super();
		gpa=new int[5];
		marks=new float[5];
		sgpa=0;
	}

	public void Entry()
	{
		super.Entry();
		System.out.println("Enter Marks :");
		for(int i=0; i<5; i++)
		{
			try 
			{
				marks[i]=scr.nextFloat();
				gpa[i]=(int)Math.ceil(marks[i]*sub[i]*0.1/cred);
				if (sgpa>10)	throw new InvalidSGPA("WrongInputs");
				else			sgpa+=gpa[i];
			}
			catch(InvalidSGPA e)
			{
				System.out.println(e);
			}
		}
	}
}

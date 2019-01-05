package StudentPackage;
import ResultPackage.*;
class CGPA1 extends SGPA implements Student
{
	float cgpa;
	SGPA sem[];
	
	CGPA1()
	{
		cgpa=0;
		sem=new SGPA[2];
		sem[0]=new SGPA();
		sem[1]=new SGPA();
	}
	
	void SemEntry()
	{
		for (int i=0; i<2; i++)
		{
			sem[i].Entry();
			cgpa+=sem[i].sgpa/2;
		}
	}
	
	void display() {
		System.out.println("Sem 1 = "+sem[0].sgpa);
		System.out.println("Sem 2 = "+sem[1].sgpa);
		System.out.println("CGPA  = "+cgpa);
	}
}

public class CGPA{
	public static void main(String args[]) {
		CGPA1 c1 = new CGPA1();
		c1.SemEntry();
		c1.display();
	}
}
package StudentPackage;
import java.util.*;
public class RegisterStudent {
	public int sub[],cred;
	public Scanner sc;
	public RegisterStudent(){
		sub=new int[5];
		cred=0;
		sc = new Scanner(System.in);
	}
	
	public void Entry() 
	{
		try 
		{
		System.out.println("Enter Credits :");
		for (int i=0; i<5; i++)
			{
				if (cred>30)	throw new CreditLimit("Exceeded 30 Credits");
				else
				{
					sub[i]=sc.nextInt();
					cred+=sub[i];
				}
			}
		}
		catch(CreditLimit e)
		{
			System.out.println(e);
		}
	}
}

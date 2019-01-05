import java.util.Scanner;
public class primchk {
	public static void chk(int n)
	{
		if (n>3)
		{
			for(int i=2; i<(n/2)+1; i++)
			{
				if (n%i==0)
				{
					System.out.println("Not a prime number");
					System.exit(0);
				}
			}
			System.out.println("A Prime Number");
		}
		else if (n>0 & n<=3)	System.out.println("A Prime Number");
		else 	System.out.println("A Negative Number");		
	}
	public static void main(String args[])
	{
		System.out.print("Number to check : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		chk(n);
	}
}

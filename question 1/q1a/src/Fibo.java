import java.util.*;
public class Fibo {
	public static int fibo(int n)
	{
		if (n<2)
			return n;
		else
			return (fibo(n-1)+fibo(n-2));
	}
	public static void fibo_nr(int n)
	{
		int a=0, b=1, c=1;
		for (int i=0;i<n; i++)
		{
			System.out.print(a+" ");
			a=b;
			b=c;
			c=a+b;
		}
	}
	public static void main(String args[])
	{
		System.out.print("Enter Number of terms: ");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Recursive;");
		for (int i=0; i<n; i++)
		{
			System.out.print(fibo(i)+" ");
		}
		System.out.println("\nNon-Recursive:");
		fibo_nr(n);
		sc.close();
	}
}
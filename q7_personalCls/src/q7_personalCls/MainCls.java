package q7_personalCls;

import java.util.*;

public class MainCls {

	public static void printf(String a)
	{
		System.out.print(a);
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		printf("Enter Number Personals : ");
		int n = sc.nextInt();
		Personal pers[] = new Personal[n];
		
		for (int i = 0; i<n; i++)
		{
			printf("Detail - "+(i+1));
			pers[i]=new Personal();
		}
		
		for (int i = 0; i<n; i++)
		{
			printf("________________________\n");
			pers[i].Display();
			pers[i].isEligible();
			pers[i].isEligiblePromotion();
			pers[i].taxpay();
			printf("________________________\n");
		}
	}
}

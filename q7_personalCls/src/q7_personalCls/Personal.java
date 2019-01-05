package q7_personalCls;

import java.util.Scanner;

public class Personal {
	
	int age, exp, no_loans;
	String name, edu;
	double salary, basic, da, hra, loan_amt;
	Scanner sc = new Scanner(System.in);
	Personal()
	{
		name = sc.next();
		age = sc.nextInt();
		edu = sc.next();
		exp = sc.nextInt();
		
		basic = sc.nextDouble();
		da = basic*0.10; 
		hra = basic*0.05;
		salary = basic*1.15;
		no_loans = sc.nextInt();
		loan_amt = sc.nextDouble();
	}
	
	Personal(int age, int exp, int no_loans, String name, String edu, double basic, double loan_amt)
	{
		this.age=age;
		this.exp=exp;
		this.no_loans=no_loans;
		this.name=name;
		this.edu=edu;
		this.basic=basic;
		this.loan_amt=loan_amt;
		da=basic*0.10;
		hra=basic*0.05;
		salary= da+hra+basic;
	}
	
	void isEligible()
	{
		if((no_loans<=2) | (loan_amt<=2000000))	System.out.println("IS ELIGIBLE FOR LOAN");
		else	System.out.println("ISN'T ELIGIBLE FOR LOAN");
	}
	
	void isEligiblePromotion()
	{
		if(age>=30 & exp>=8)	System.out.println("IS ELIGIBLE FOR PROMOTION");
		else	System.out.println("ISN'T ELIGIBLE FOR PROMOTION");
	}
	
	void taxpay()
	{
		if (salary >= 1500000)	System.out.println("Taxpay : "+salary*0.10);
		else if (salary < 1500000 || salary >= 500000)	System.out.println("Taxpay : "+salary*0.07);
		else	System.out.println("Taxpay : "+salary*0.03);
	}
	
	void printf(String a)
	{
		System.out.print(a);
	}
	void Display()
	{
		printf("\nName : "+name);
		printf("\nEducation : "+edu);
		printf("\nAge : "+age);
		printf("\nExperience : "+exp+"\n");
		printf("\nSalary : "+salary);
		printf("\nBasic : "+basic);
		printf("\nDA : "+da); 
		printf("\nHRA : "+hra+"\n");
		printf("\nNumber of loans : "+no_loans);
		printf("\nLoan Amount : "+loan_amt+"\n________________________\n");
	}
}

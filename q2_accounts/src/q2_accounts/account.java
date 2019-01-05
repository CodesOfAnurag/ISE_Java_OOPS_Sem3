package q2_accounts;
import java.util.*;
class accounts {
	int Accno; 
	String name; 
	int PhNo; 
	float balance_amt;
	Scanner sc = new Scanner(System.in);
	accounts(int Accno, String name, int PhNo, float balance_amt)
	{
		this.Accno=Accno; 
		this.name=name; 
		this.PhNo=PhNo; 
		this.balance_amt=balance_amt;
	}
	accounts()
	{
		this.Accno=0; 
		this.name=""; 
		this.PhNo=0; 
		this.balance_amt=0;
	}
	
	void printf(String a)
	{
		System.out.print(a);
	}
	
	void getInput()
	{
		printf("Enter Account Number : ");
		Accno=sc.nextInt();
		printf("Enter Name : ");
		name=sc.next();
		printf("Enter Phone Number : ");
		PhNo=sc.nextInt();
		printf("Enter Balance Amount : ");
		balance_amt=sc.nextFloat();
	}
	
	void print()
	{
		printf("Account Number : "+Accno);
		printf("\nName : "+name);
		printf("\nPhone Number : "+PhNo);
		printf("\nBalance Amount : "+balance_amt);
	}
	
	void Deposit(int m)
	{
		balance_amt+=m;
	}
	
	void Withdraw(int m)
	{
		balance_amt-=m;
	}
	
	void menu()
	{
		int res;
		while (true)
		{
			printf("\nMENU : \n 1 - getdata\n 2 - print\n 3 - Deposit\n 4 - Withdraw\n 5 - Exit\n");
			printf("Enter Response :");
			res = sc.nextInt();
			switch(res)
			{
			case 1 : 
				getInput(); 	
				break;
			case 2 : 
				print();		
				break;
			case 3 : 
				printf("Enter Deposite Amount : ");
				int amt = sc.nextInt();
				Deposit(amt);
				break;
			case 4 : 
				printf("Enter withdraw Amount : ");
				int amt1 = sc.nextInt();
				Withdraw(amt1);
				break;
			case 5 :
				System.exit(0); 
				break;
			default:
				printf("Invalid Input\n");
			}
			
		}
	}
}
public class account{
	public static void main(String args[])
	{
		accounts ac1 = new accounts();
		ac1.menu();
	}
}
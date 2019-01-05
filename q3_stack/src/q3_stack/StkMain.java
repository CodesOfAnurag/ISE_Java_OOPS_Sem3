package q3_stack;
import java.util.*;
class Stack {
	int arr[],top,size;
	Stack(int s){
		size=s;
		arr=new int[s];
		top=-1;
	}
	boolean is_empty()
	{
		if (top==-1)	return true;
		else			return false;
	}
	boolean is_full()
	{
		if (top==size-1)	return true;
		else				return false;
	}
	void printf(String a)
	{
		System.out.print(a);
	}
	void push()
	{
		if (is_full())	printf("OverFLow\n");
		else
			{
			Scanner sc = new Scanner(System.in);
			printf("Enter Item : ");
			arr[++top]=sc.nextInt();
			//sc.close();
			}
	}
	void pop()
	{
		if (is_empty())	printf("UnderFlow\n");
		else			printf("Deleted Item : "+arr[top--]+"\n");
	}
	void display()
	{
		if (is_empty())	printf("Empty\n");
		else
		{
			for(int i=0; i<=top; i++)
				printf(arr[i]+" ");
			printf("\n");
		}
	}
}
public class StkMain{
	static void printf(String a)
	{
		System.out.print(a);
	}
	public static void main(String args[])
	{
		Stack stk = new Stack(5);
		
		int res;
		while (true)
		{
			printf("\nMENU : \n 1 - push\n 2 - pop\n 3 - Display\n 4 - Exit\n");
			printf("Enter Response :");
			Scanner scr = new Scanner(System.in);
			res = scr.nextInt();
			//scr.close();
			switch(res)
			{
			case 1 : 
				stk.push(); 	
				break;
			case 2 : 
				stk.pop();		
				break;
			case 3 : 
				/*printf("Enter Deposite Amount : ");
				int amt = sc.nextInt();*/
				stk.display();
				break;
			case 4 :
				System.exit(0); 
				break;
			default:
				printf("Invalid Input\n");
			}
		}
	}
}
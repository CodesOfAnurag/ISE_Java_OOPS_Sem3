package q12a_stringQueues;

import java.util.*;
class StrQueue {

	ArrayList<String> slist;
	
	StrQueue()
	{
		slist = new ArrayList<String>();
	}
	
	void enQueue(String item)
	{
		slist.add(item);
	}
	
	void deQueue()
	{
		if(slist.size()!=0)		System.out.println("Deleted Item : "+slist.remove(0));
		else					System.out.println("Empty List");
	}
	
	void display()
	{
		if(slist.size()!=0)		System.out.println(" Items are : "+slist);
		else					System.out.println("Empty List");
	}
}


public class StringQueue{
	public static void main(String args[])
	{
		StrQueue st1 = new StrQueue();
		Scanner sc = new Scanner(System.in);
		int res;
		while (true)
		{
			System.out.print("Enter\n 1 - Entry\n 2 - Delete\n 3 - Display\n 4 - Exit\nEnter Response : ");
			res = sc.nextInt();
			switch(res)
			{
			case 1 : 
				String item = sc.next();
				st1.enQueue(item);
				break;
			case 2 :
				st1.deQueue();
				break;
			case 3 :
				st1.display();
				break;
			case 4 :
				System.exit(0);
			}
		}
	}
}
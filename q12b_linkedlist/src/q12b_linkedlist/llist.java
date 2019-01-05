package q12b_linkedlist;
import java.util.*;


class llist_itr {
	LinkedList<String> ll;
	llist_itr()
	{
		ll = new LinkedList<String>();
	}
	
	void enter(String item)
	{
		ll.add(item);
	}
	
	void disp()
	{
		Iterator<String> itr = ll.listIterator();
		while(itr.hasNext())
		{
			String item = itr.next();
			if (item.length()<=5)	System.out.println(item+" ");
		}
		
	}
}

public class llist{
	public static void main(String args[])
	{
		llist_itr st1 = new llist_itr();
		Scanner sc = new Scanner(System.in);
		int res;
		while (true)
		{
			System.out.print("Enter\n 1 - Entry\n 2 - Display\n 3 - Exit\nEnter Response : ");
			res = sc.nextInt();
			switch(res)
			{
			case 1 : 
				String item = sc.next();
				st1.enter(item);
				break;
			case 2 :
				st1.disp();
				break;
			case 3 :
				System.exit(0);
			}
		}
	}
}

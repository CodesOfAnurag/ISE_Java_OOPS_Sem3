package StudentPackage;

public class CreditLimit extends Exception {
	String msg;
	CreditLimit(String e)
	{
		msg = e;
	}
	public String toString()
	{
		return msg;
	}
	
}

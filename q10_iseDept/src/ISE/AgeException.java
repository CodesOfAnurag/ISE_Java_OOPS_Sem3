package ISE;

public class AgeException extends Exception {
	String msg;
	AgeException(String e)
	{
		msg=e;
	}
	
	public String toString()
	{
		return msg;
	}
}

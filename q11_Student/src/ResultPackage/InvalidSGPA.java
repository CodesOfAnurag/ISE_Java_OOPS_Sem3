package ResultPackage;

public class InvalidSGPA extends Exception {
	String msg;
	public InvalidSGPA(String e)
	{
		msg = e;
	}
	public String toString()
	{
		return msg;
	}
	
}

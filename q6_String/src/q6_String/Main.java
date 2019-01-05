package q6_String;

public class Main {
	public static void main(String args[])
	{
		Str_opr st1 = new Str_opr("Hello World Hello");
		st1.StrPort(3,5);
		st1.StrCount("Hello");
		st1.StrRep("Hello", "Bye");
		st1.StrRearg();
		st1.StrComp("Hello");
		st1.StrComp("Hello World Hello");
		st1.StrConcat(" Suckers");
	}
}

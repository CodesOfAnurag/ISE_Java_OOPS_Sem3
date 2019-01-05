package q9_Vehicle;
import java.util.*;
public class MyTwoWheeler extends TwoWheeler {
	String clr;
	Scanner sc = new Scanner(System.in);
	MyTwoWheeler()
	{
		super();
		clr="NULL";	
	}
	void getin()
	{
		super.getData();
		super.printf("Enter Color : ");
		clr=sc.next();
	}
	
	void putin()
	{
		super.putData();
		super.printf("Color : "+clr);
	}
}

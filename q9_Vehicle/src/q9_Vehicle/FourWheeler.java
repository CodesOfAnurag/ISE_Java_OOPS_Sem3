package q9_Vehicle;

import java.util.Scanner;

final public class FourWheeler extends Vehicle {
	int eng, kms, fuel;
	Scanner sc = new Scanner(System.in);
	FourWheeler()
	{
		super();
		eng=-1;
		kms=-1;
		fuel=-1;
	}
	void printf(String a)
	{
		System.out.print(a);
	}
	public void getData()
	{
		printf("Enter Year of manufacturing : ");
		yom=sc.nextInt();
		printf("Enter No of Stroke engine (2/4) : ");
		eng=sc.nextInt();
		printf("Enter Kms rode : ");
		kms=sc.nextInt();
		printf("Enter Fuel Left : ");
		fuel=sc.nextInt();
	}
	public void putData()
	{
		printf("\nYear Of Manufacturing : "+yom);
		printf("\nEngine Type : " + eng );
		printf("\nKms Travelled : " + kms);
		printf("\nfuel left : "+fuel+"\n");
	}
}

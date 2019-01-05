package q8_Circle;

public class MainCls {
	public static void main(String args[])
	{
		Circle c1 = new Circle(7);
		System.out.println("Area of Circle : "+c1.area());
		Sector sc1 = new Sector(7,Math.PI/3);
		System.out.println("Area of Sector : "+sc1.area());
		Segment sg1= new Segment(7, 7);
		System.out.println("Area of Segment : "+sg1.area());

	}
}

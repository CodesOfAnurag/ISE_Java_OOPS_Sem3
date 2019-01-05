package q8_Circle;

public class Circle {
	double rad;
	Circle()
	{
		rad=0;
	}
	Circle(double r)
	{
		rad=r;
	}
	
	double area()
	{
		return (rad*rad*Math.PI);
	}
}

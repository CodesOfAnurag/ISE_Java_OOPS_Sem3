package q8_Circle;

public class Sector extends Circle {
	double ang;
	
	Sector()
	{
		super();
		ang=0;		
	}
	
	Sector(double r, double ang)
	{
		super(r);
		this.ang=ang;
	}
	
	double area()
	{
		return (0.5*rad*rad*ang);
	}
}

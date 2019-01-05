package q8_Circle;

public class Segment extends Circle {
	double len;
	
	Segment()
	{
		super();
		len=0;		
	}
	
	Segment(double r, double len)
	{
		super(r);
		this.len=len;
	}
	
	double area()
	{
		return (rad*rad)*(rad-len)/rad-Math.sqrt((rad-len)*(2*rad*len-len*len));
	}

}

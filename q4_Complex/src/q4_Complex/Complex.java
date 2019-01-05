package q4_Complex;

public class Complex {
	float re,im;
		
	Complex()
	{
		re=0;
		im=0;
	}
	Complex(float x, float y)
	{
		re=x;
		im=y;
	}
	Complex(Complex o)
	{
		re=o.re;
		im=o.im;
	}
	
	
	Complex Sum(Complex o1)
	{
		Complex cs = new Complex(o1);
		cs.re+=re;
		cs.im+=im;
		return cs;
	}
	
	Complex Mul(Complex o1)
	{
		Complex cm = new Complex();
		cm.re = re*o1.re - im*o1.im;
		cm.im = re*o1.im + im*o1.re;
		return cm;
	}
	
	void print()
	{
		System.out.println(re+" + "+im+"i");
	}
}

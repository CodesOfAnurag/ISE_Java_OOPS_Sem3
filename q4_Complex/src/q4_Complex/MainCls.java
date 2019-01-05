package q4_Complex;



public class MainCls {
	public static void main(String args[])
	{
		Complex c1 = new Complex(1,0);
		Complex c2 = new Complex(8,8);
		Complex cs = c1.Sum(c2);
		Complex cm = c1.Mul(c2);
		System.out.print("Sum : ");			cs.print();
		System.out.print("Product : ");		cm.print();
	}
}

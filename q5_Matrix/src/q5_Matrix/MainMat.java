package q5_Matrix;


public class MainMat {
	public static void main(String args[])
	{
		Matrix m1 = new Matrix(2);
		Matrix m2 = new Matrix(2);
		Matrix ms = m1.sum(m2);
		Matrix mp = m1.mul(m2);
		ms.display();
		mp.display();
	}
}

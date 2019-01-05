
public class Maincls {
	public static void main(String args[])
	{
		mat m1 = new mat(2,1);
		mat m2 = new mat(1,2);
		m1.entry();
		m2.entry();
		mat mm =m1.mult(m2);
		mm.display();
	}
}

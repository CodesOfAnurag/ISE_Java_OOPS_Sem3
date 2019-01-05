import java.util.*;
public class mat {
	int m[][],r,c;
	Scanner sc = new Scanner(System.in);
	mat(int r, int c)
	{
		this.r=r;
		this.c=c;
		m=new int[r][c];
		for (int i=0; i<r; i++)
			for (int j=0; j<c; j++)
				m[i][j]=0;
	}
	
	void entry()
	{
		System.out.println("Enter Values :");
		for (int i=0; i<r; i++)
			for (int j=0; j<c; j++)
				m[i][j]=sc.nextInt();
	}
	
	mat mult(mat m1)
	{	mat m2 = new mat(r,m1.c);
		if(c==m1.r)
		{
			for (int i=0; i<r; i++)
				for (int j=0; j<m1.c; j++)
					for(int k=0; k<c; k++)
					{
						m2.m[i][j]+=m[i][k]*m1.m[k][j];
					}
		}
		return m2;
	}	
	
	void display()
	{
		for (int i=0; i<r; i++)
			{
			for (int j=0; j<c; j++)
				System.out.print(m[i][j]+" ");
			System.out.println("");
			}
				
	}
}

package q5_Matrix;

import java.util.*;

public class Matrix {
	
	int mat[][],s;
	Scanner sc = new Scanner(System.in);
	Matrix(int s)
	{
		this.s = s;
		mat = new int[s][s];
		for(int i=0; i<s; i++)
			for (int j=0; j<s; j++)
			{
				mat[i][j]=sc.nextInt();
			}
	}
	
	Matrix(Matrix m1)
	{
		s=m1.s;
		mat = new int[m1.s][s];
		for(int i=0; i<s; i++)
			for (int j=0; j<s; j++)
				mat[i][j]=0;
	}
	
	Matrix sum(Matrix m1)
	{
		Matrix ms = new Matrix(m1);
		for(int i=0; i<s; i++)
			for (int j=0; j<s; j++)
				ms.mat[i][j]=mat[i][j]+m1.mat[i][j];
		return ms;
	}
	
	void display()
	{
		for(int i=0; i<s; i++)
		{
			for (int j=0; j<s; j++)
				System.out.print(mat[i][j]+" ");
			System.out.println();
		}
	}
	
	Matrix mul(Matrix m2)
	{
		Matrix mp = new Matrix(m2);
		for(int i=0; i<s; i++)
			for (int j=0; j<s; j++)
				for(int k=0;k<s;k++)
					mp.mat[i][j]+=mat[i][k]*m2.mat[k][j];
		return (mp);
	}
}
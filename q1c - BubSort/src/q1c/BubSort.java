
package q1c;
import java.util.*;


public class BubSort {
	static void printf(String a)
	{
		System.out.print(a);
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		printf("Enter Size : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		printf("Enter Item : \n");
		for(int i=0; i<n; i++)
			arr[i]=sc.nextInt();
		for ( int i=0; i<n-1; i++)
			for( int j=0; j<n-1-i; j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		printf("Sorted Array :\n");
		for(int i=0; i<n; i++)
			printf(arr[i]+" ");
		printf("\n");
		sc.close();
	}
	 
}

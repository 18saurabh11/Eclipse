import java.util.*;
public class Cyclic_Rotation_Array
{
	static void RightRotate(int a[],int n, int k)
	{
		k=k%n; 												//if no. of rotations is greater than an array 
		for(int i = 0; i < n; i++)
	    {
	        if(i<k)
	        {
	            System.out.print(a[n + i - k]+ " ");		// Printing rightmost kth elements
	        }
	        else
	        {
	            System.out.print(a[i - k]+ " ");			// Prints array after 'k' elements
	        }
	    }
	    System.out.println();
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n,k;
		n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		k=sc.nextInt();
		RightRotate(arr,n,k);
	}

}

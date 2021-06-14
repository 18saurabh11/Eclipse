package newproject;

public class Array_Demo 
{

	public static void main(String[] args)
	{
		int a[]= new int[4];          //1-D Array
		a[0]= 5;
		a[1]= 8;
		a[2]= 36;
		a[3]= 54;
		for(int i=0;i<4;i++)
		{
			System.out.println(" " + a[i]);
		}
		System.out.println();
		
		for(int k : a)					// Enhanced for loop for 1-D Array
		{
			System.out.println(" " + k);
		}
		System.out.println();
		
		int b[] = {1,2,3,4};          //2-D Array
		int c[] = {5,6,7,8};
		int d[] = {9,10,11,12};
		
		int e[][] = {
						{1,2,3,4},
						{5,6,7,8},
						{9,10,11,12}
					};
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.print(" " + e[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		
		for(int k[] : e)			//Enhanced for loop for 2-D Array
		{
			for(int l : k)
			{
				System.out.print(" " + l);
			}
			System.out.println();
		}
		System.out.println();
		
		int f[] = {5,6,4,1};         //Jagged Array
		int g[] = {3,8,1};
		int h[] = {7,6,4,2,5};
		
		int k[][] = {
						{5,6,4,1},
						{3,8,1},
						{7,6,4,2,5}
					};
		for(int i=0;i<k.length;i++)
		{
			for(int j=0;j<k[i].length;j++)
			{
				System.out.print(" " + k[i][j]);
			}
			System.out.println();
		}
		
	}

}

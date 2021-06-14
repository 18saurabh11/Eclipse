package newproject;
public class iteration  // while,do-while,for,for-each
{
	public static void main(String[] args) 
	{
		int i = 3; // only while
		while(i<=5)
		{
			System.out.println("hello bro");
			i++;
		}
		System.out.println();
		System.out.println();
		
		int j = 3; // do-while
		do
		{
			System.out.println("Hello sis");
			j++;
		}
		while(j<=5);
		System.out.println();
		System.out.println();
		
		for(int h=1;h<=5;h++)
		{
			System.out.println("Hello Father");
			
		}
		System.out.println();
		System.out.println();
		
		/*
		 * * * *					//   *nested loop*
		 * * * *
		 * * * *
		 * * * *
		 */
		
		for(int l=1;l<=4;l++)		//	*nested loop*
			{
				for(int k=1;k<=4;k++)
				{
					System.out.print("* ");
				}
				System.out.println("* ");
			}
	}

}

package newproject;

public class break_continue_loop {

	public static void main(String[] args)
	{
		for(int i=1;i<11;i++)
		{
			if(i==7)
			{
				continue;     //will skip 7,rest all digits be printed
			}
			System.out.println(i);
		}
		System.out.println();
		
		for(int i=1;i<=10;i++)
		{
			if(i>6)
			{
				break;        //will break after finding digit greater than 6
			}
			System.out.println(i);
		}

	}

}

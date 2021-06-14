package newproject;

public class ExceptionDemo2 {

	public static void main(String[] args)
	{
		int i,j;
		i=9;
		j=10;
			
		try
		{
			int k = i/j;
			if(k==0)
			{
				throw new ItachiException(" this is not possible");			}
			System.out.println(k);
		}
		
		catch(ItachiException e)
		{
			System.out.println("Error" + e.getMessage());
		}

	}

}

package newproject;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UserInput 
{
	public static void main(String[] args) throws Exception
	{
		int n = 0;
		System.out.println("Enter no.");
		BufferedReader br = null;
		
		try 
		{
			br = new BufferedReader(new InputStreamReader(System.in));
			n = Integer.parseInt(br.readLine());	//45
		}
		//try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))             //this method is called "try with resource" and it doesn't require catch or finally block.
		//{
			//n = Integer.parseInt(br.readLine());
		//}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		finally
		{
			br.close();
		}
		System.out.println(n); 
	}
}

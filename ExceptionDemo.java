package newproject;

public class ExceptionDemo {

	public static void main(String[] args)
	{
		try																//any suspected statement that could create error is placed inside try block.
		{
			int a[] = null; //new int[6];
			a[6] = 8;
			int i = 8;
			int j = 0;
			int k = i/j;
		}
		
		catch(ArithmeticException e)									//every "try" block needs to have a "catch" block for alternate output in case error occurs.
		{
			System.out.println("Error divided by zero");
			System.err.println("Error");								//we can use "system.err.printlnn()" to print the message in red colour.
		}
		
		catch(ArrayIndexOutOfBoundsException e)							//this case will run for exceptions related to limit of array.
		{
			System.out.println("Be in your limit....");
		}
		
		catch(Exception e)												//this case will run for any kind of exception.
		{
			System.out.println("Something is wrong...");
		}
		
		
		finally															//"finally" block is used to print any statement that is mandatory to be printed even when the error occurs in "try" block or not.
		{
			System.out.println("hello,how are you?");
		}

	}

}

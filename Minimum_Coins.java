import java.util.*;
public class Minimum_Coins 
{
	static int minimum_coins(int n)
	{
		int five=(n-4)/5;
		
		int one;
		if(((n-5*five)%2)==0)
		{
			one=2;
		}
		else
		{
			one=1;
		}
		
		int two=(n-5*five-1)/2;
		System.out.println("five"+" "+five);
		System.out.println("two"+" "+two);
		System.out.println("one"+" "+one);
		return(five+two+one);
	}
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int n;
		n=sc.nextInt();
		int answer=minimum_coins(n);
		System.out.println(answer);
	}

}

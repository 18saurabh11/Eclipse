import java.util.LinkedHashSet;
import java.util.Scanner;
  
class non_repeated_digits
{
	static int repeated_digit(int n) 									// Function to check if the given number has repeated digit or not 
	{
		LinkedHashSet<Integer> s = new LinkedHashSet<>();
		while (n != 0) 													// Traversing through each digit 
		{
			int d = n % 10;
			if (s.contains(d))											// if the digit is present more than once in the number
			{
				return 0;												// return 0 if the number has repeated digit 
			}
			s.add(d);
			n = n / 10;
		}
		return 1;														// return 1 if the number has no repeated digit 
	}
	static int calculate(int n1, int n2) 								// Function to find total number in the given range which has no repeated digit
	{
		int answer = 0;
		for (int i = n1; i < n2 +1; ++i) 								// Traversing through the range
		{
			answer = answer + repeated_digit(i);						// Add 1 to the answer if i has no repeated digit else 0
		}
		return answer;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n1,n2;
		n1=sc.nextInt();
		n2=sc.nextInt();
		System.out.println(calculate(n1, n2));
	}
}
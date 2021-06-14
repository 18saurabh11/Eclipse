package newproject;

public class OperatorDemo {
	/*
	*
	*arithematic  +,-,*,/,%
	*bitwise
	*relational
	*logical
	*
	*
	*
	*
	*/
	

	public static void main(String[] args)
	{
		// arithematic
		
		int n=5,m=60;
		int s=n+m; //addition
		int d=m/n; //division
		int mo=m%n; //modulous
		int mi = m-n; //subtraction
		int mu = m*n; //multiplication
		
		System.out.println(s);
		System.out.println(d);
		System.out.println(mo);
		System.out.println(mi);
		System.out.println(mu);
		
		n+=3;  //post-increment operator
		System.out.println(n);
		
		n++;  //post-increment operator
		System.out.println(n);
		
		n-=3;  //decrement operator
		System.out.println(n);
		
		n--;  //decrement operator
		System.out.println(n);
		
		++n;  //pre-increment operator
		System.out.println(n);

	}

}

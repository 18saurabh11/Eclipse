package newproject;
class calc
{
	int num1;
	int num2;
	int result;
	String s;
	
	public calc()
	{
		 num1 = 5;
		 num2 = 4;
		 System.out.println("IS CONSTRUCTOR");
	}
	public calc(int n)
	{
		num1=n;
		num2=n;
		System.out.println("IN CONSTRUCTOR");
	}
	public calc(double d)
	{
		num1 = (int)d;
		System.out.println("AT CONSTRUCTOR");
	}
	public calc(double d,int n,String s)
	{
		num1=(int)d;
		num2=n;
		this.s=s;
		System.out.println("OVER CONSTRUCTOR");
	}
	public calc(int num1,int num2)
	{
		this.num1=num1;			//use of THIS keyword....showing current object and identifying local and instance variable
		this.num2=num2;
	}
}

public class Constructor 
{
	public static void main(String[] args) 
	{
		calc obj = new calc(6.5,5,"hello");      //CONSTRUCTOR  (Same name as class)
									     //VALUES CAN BE ()DEFAULT, 8 INT ,9.1 DOUBLE
		System.out.println(obj.num1);
		System.out.println(obj.num2);
		System.out.println(obj.s);
	}
}

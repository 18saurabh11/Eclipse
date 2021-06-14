package newproject;

class C
{
	int i;
	public void show()
	{
		System.out.println("in C");
		System.out.println(i);
	}
}

class D extends C
{
	int i = 45;							//assigns 45 to i of sub class
	public void show()
	{
		super.i=8;						//assigns i in super class to 8
		super.show();					//refers to show() method of super class
		System.out.println("in D");
		System.out.println(i);
	}
}

class E extends C
{
	public void show()
	{
		System.out.println("in E");
	}
}
public class OverrideDemo 
{

	public static void main(String[] args)
	{
		C obj1 = new D();			//Runtime Polymorphism
		obj1.show();
		
		obj1 = new E();
		obj1.show();				//Dynamic Method Dispatch
	}

}

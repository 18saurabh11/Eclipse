package newproject;

//Abstract class -> Define and declare methods
//Interface -> Declare methods -> in java 1.7
//java 1.8 can define methods in java using "default" keyword.

interface Demo
{
	void abc();
	default void show()										//"default" keyword is used so that a method can be defined in interface and not just get declared.
	{
		System.out.println("In Demo show");
	}
}

interface MyDemo
{
	default void show()	
	{
		System.out.println("In MyDemo show");
	}
}

interface StaticMethodDemo
{
	int num=9;												//Any variable declared inside interface becomes final by default and its value cannot be altered further.
	static void show()										//By using "static" keyword with method of interface class,we can call that method directly from main without creating the object of concerned interface.
	{
		System.out.println("In Static Demo");
	}
}
class ImpDemo implements Demo,MyDemo,StaticMethodDemo
{
	public void abc()
	
	{
		//num=10;											//Value cannot be altered because "num" is declared inside interface.
		System.out.println("in abc");
	}

	@Override
	public void show()
	{
		MyDemo.super.show();								//two interfaces having same method() create ambiguity which is solved by overriding either of the methods by using "super" keyword.
	}
	
	//public void show()
	//{
		//System.out.println("In overridden show");	 		//Overridden show() method
	//}
}
public class DefaultInterfaceMethod
{

	public static void main(String[] args)
	{
		Demo obj = new ImpDemo();
		obj.abc();
		obj.show();
		StaticMethodDemo.show();							//Directly calls method of mentioned interface without creating its object by using "static" keyword.
	}

}

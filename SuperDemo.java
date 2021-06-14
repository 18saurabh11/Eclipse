package newproject;
class A
{
	public A()
	{
		System.out.println("int A");
	}
	
	public A(int i)
	{
		System.out.println("int A int");
	}
}

class B extends A
{
	public B()
	{
		System.out.println("int B");
	}
	
	public B(int i)
	{
		super(i);            						 //super keyword refers to the method or constructor of super class giving it priority as compared to sub class
		System.out.println("int B int");
	}
}
public class SuperDemo {

	public static void main(String[] args)
	{
		B obj = new B(5);
	}

}

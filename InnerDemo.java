package newproject;

class Outer
{
	int a;
	public void show()
	{
		
	}
	
	class Inner       //Outer$Inner.class
	{
		public void display()
		{
			System.out.println("IN INNER");
		}
	}
	
}

public class InnerDemo
{

	public static void main(String[] args) 
	{
		Outer obj = new Outer();
		obj.show();
		
		Outer.Inner obj1 = obj.new Inner();     //Outer.Inner obj1 = new Outer.Inner();   [IN CASE OF STATIC INNER CLASS]
												//object rerference of Inner class of Outer class
		obj1.display();
		
	}

}

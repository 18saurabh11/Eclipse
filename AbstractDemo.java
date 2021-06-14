package newproject;

abstract class human
{
	public abstract void eat();
	
	public void walk()
	{
		
	}
}

class man extends human					//human is an abstract class which gets extended by man class
{
	public void eat()
	{
		
	}
}

class Printer
{	
	public void show(Number i)			//Number is an abstract class of Integer,double,float,etc
	{									//Abstract classes are used so that its object cannot be created and can be used by other classes by extending this abstract class
		System.out.println(i);
	}
}
public class AbstractDemo {

	public static void main(String[] args)
	{
		human obj = new man();
		Printer obj1 = new Printer();
		obj1.show(5.5f);
		
		pen obj2 = new pencil();

	}

}

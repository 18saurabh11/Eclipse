package newproject;

class N
{
	final int DAY;					//final makes variable constant
	public N()
	{
		DAY = 10;					//Since DAY was not assigned a value at first instance (line 5) so the next available instance becomes constant i.e. DAY=10
		//DAY = 20;
	}
}

final class M						//final when used with class then that class cannot be inherited by any other class.
{
	public final void show()		//final when used by method then that method cannot be overridden by any other  method of other extended class
	{
		System.out.println("in A");
	}
}
class L extends M
{
	public void show()
	{
		System.out.println("in B");
	}
}
public class FinalDemo {

	public static void main(String[] args)
	{
		N obj = new N();
		System.out.println(obj.DAY);
		M obj1 = new M();
		L obj2 = new L();
		
		obj2.show();
	}

}

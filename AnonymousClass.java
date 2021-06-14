package newproject;
class J
{
	public void show()
	{
		System.out.println("I am J");
	}
}
public class AnonymousClass {

	public static void main(String[] args)
	{
		J obj = new J()
				{
					public void show()								//This is anonymous class without name which is overriding show() method of class J.
					{
							System.out.println("I am anonymous");
					}
				};
				
		obj.show();

	}

}

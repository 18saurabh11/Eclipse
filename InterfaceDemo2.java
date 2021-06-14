package newproject;

//Types of interface
//1.Normal Interface
//2.Single abstract method - Functional interface - lambda expression - scala
//3.Marker Interface

interface abc
{
	public void show();
}

// class implementor implements abc
// {
//		public void show()																			//1.former class which now converted into anonymous class in main method
//		{
//			System.out.println("interface");
//		}
// }
public class InterfaceDemo2 {

	public static void main(String[] args) 
	{
		abc obj =() -> System.out.println("I am lambda expression");								//3.Lambda expression adapted from scala (it refers to the method definition of interface for which it has created object)
				//new abc()
				//{
					//public void show()																//2.Anonymous class
					//{
						//System.out.println("I am anonymous class instead of implementor class");
					//}
				//};
		obj.show();

	}

}

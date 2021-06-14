package newproject;
class Cal
{
	int num1;
	int num2;
	int result;
	
	public void perform()
	{
		result=num1 + num2;
	}
	
}
public class ObjectDemo 
{

	public static void main(String[] args) 
	{
		Cal obj = new Cal();   // OBJECT: knows somethimg,Does something.
		obj.num1 = 5;
		obj.num2 = 3;
		obj.perform();
		System.out.println(obj.result); 
	}

}

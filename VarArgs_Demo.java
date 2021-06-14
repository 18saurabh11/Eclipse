package newproject;
class Calu
{
	public int add(int ...n)		//Variable Length Arguments......   VarArgs
	{
		int sum = 0;
		for(int i : n)
		{
			sum= sum + i;
		}
		return sum;
	}
}
public class VarArgs_Demo
{
	public static void main(String[] args)
	{
		Calu obj = new Calu();
		System.out.println(obj.add(1,2,3,4,5,6));

	}

}
 // Varargs is used so that can any no. of inputs can be given to parameter of "int add" and changing of no. of parameters 
//can be easily avoided
package newproject;

public class WrapperDemo
{

	public static void main(String[] args)
	{
		String str = "123";
		int j =Integer.parseInt(str);
		System.out.println(j);

	}

}

//int i = 5; 						//primitive datatype
//Integer ii = new Integer(i);		//wrapping-boxing

//int j = ii.intValue();			//unboxing-unwrapping

//Integer value = i;				//auto-boxing
//int k = value;					//auto-unboxing
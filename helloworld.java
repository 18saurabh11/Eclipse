package newproject;

public class helloworld
{
	public static void main(String[] args)
	{
		System.out.println("hello World");
		
		//int,short,byte,long,double,float
		
		long l = 5_00_00_00_00_00_00_00_0l; //8 bytes....64 bits
		int a = 5_00_00_00_00; // 4 bytes....32 bits =>> -200_00_00_00_0 to 200_00_00_00_0  approx.
		short s = 5_00_0; //2 bytes....16 bits=>> -32768 to 32767
		byte b = 5_0; //1 byte....8 bits =>> -128 to 127
		double d = 5.55; // 8 bytes....64 bits
		float f = 5.55f; // 4 bytes....32 bits
		
		System.out.println(a); //int a
		System.out.println(s); //short s
		System.out.println(b); //byte b
		System.out.println(l); //long l
		System.out.println(d); //double d
		System.out.println(f); //float f
		
		char c1 = 'A'; //char value
		char c = 69; // ASCII value (American Standard Code for Information Interchange) 
		System.out.println(c1);
		System.out.println(c);
		
		double d1 = 5; // implicit conversion
		int d2 =(int)5.5; // Type casting (explicit conversion)
		System.out.println(d1);
		System.out.println(d2);

	}
}
package newproject;
class Emp
{
	int eid;
	int salary;
	static String ceo;       //static for all values of ceo
	
	void show()
	{
		System.out.println(eid+" : "+salary+" : "+ceo);
	}
}
public class StaticDemo 
{

	public static void main(String[] args) 
	{
		Emp navin=new Emp();
		navin.eid=10;
		navin.salary=50000;
		navin.ceo="Mahesh";   //cabwa   Emp.ceo="Nikita";
		
		Emp rahul=new Emp();
		rahul.eid=11;
		rahul.salary=2000;
		rahul.ceo="Ramu";     //cabwa   Emp.ceo="Nikita";
		
		
		rahul.ceo="Nikita";   //can also be written as : Emp.ceo="Nikita";  ,because ceo is static for all employees
		
		navin.show();
		rahul.show();
		System.out.println();
		System.out.println();
		
		emp2 saurabh=new emp2();
		emp2 shivam=new emp2();
		saurabh.show();
		shivam.show();
		

	}

}


// OPTION 2  
// MAIN method above
class emp2
{
	int eid;
	int salary;
	static String ceo;
	public emp2()    //when you create an object
	{
		eid=1;
		salary=1000;
		System.out.println("in constructor");
	}
	static        //when you load a class
	{
		ceo="larry";
		System.out.println("in static");
	}
	void show()
	{
		System.out.println(eid+" : "+salary+" : "+ceo);
	}
}

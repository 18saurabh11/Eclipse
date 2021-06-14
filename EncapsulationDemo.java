package newproject;

class Student
{
	private int rollno;
	private String name;
	 
	//GETTERS AND SETTERS
	
	public int getRollno()
	{
		return rollno;
	}
	public void setRollno(int rollno)
	{
		this.rollno = rollno;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	
	
}

public class EncapsulationDemo {

	public static void main(String[] args)
	{
		Student obj1 = new Student();
		obj1.setRollno(8);
		obj1.setName("Saurabh");
		
		System.out.println(obj1.getRollno());
		System.out.println(obj1.getName());

	}

}

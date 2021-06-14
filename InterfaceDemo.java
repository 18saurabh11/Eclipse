package newproject;

interface writer								//interface is same as abstract but it implements and can allow further extending of any ither class
{
	public abstract void write();
	public abstract void type();
}

class stick
{
	public void  type()
	{
		System.out.println("i am a stick");
	}
}

class pen extends stick implements writer		//allows pen to extend stick implementing class writer
{
	public void write()
	{
		System.out.println("I am a pen");
	}
}

class pencil extends stick implements writer
{
	public void write()
	{
		System.out.println("I am a pencil");
	}
}

class kit
{
	public void DoSomething(writer p)
	{
		p.write();
	}
}

public class InterfaceDemo {

	public static void main(String[] args) 
	{
		writer p = new pen();
		kit k = new kit();
		writer pc = new pencil();
		stick s = new pen();
		pc.type();
		k.DoSomething(pc);
	}

}

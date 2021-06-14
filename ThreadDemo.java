package newproject;

class hi implements Runnable										//class implemented to thread so that 2 or more classes can work parallely.
//class hi extends Thread											//class extended to thread so that 2 or more classes can work parallely.
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Hi");
			try{Thread.sleep(1000);} catch(Exception e){}			//for delay of 1000 milliseconds(1 second) between every print statement.
		}
	}
}
class hello implements Runnable
//class hello extends Thread
{
	public void run()												//only objects with name "run" can be called in case of threads.And they are called by using "obj.start" as command.
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Hello");
			try{Thread.sleep(1000);} catch(Exception e){}
		}
	}

}
public class ThreadDemo 
{

	public static void main(String[] args) 
	{
		//hi obj1 = new hi();									//Used in case of extending class "Thread".
		//hello obj2 = new hello();
		
		Runnable obj1=new hi();									//Used in case of implementing interface.
		Runnable obj2=new hello();
		
		Thread t1 = new Thread(obj1);							//Used in case of implementing interface.
		Thread t2 = new Thread(obj2);
		
		t1.start();												////Used in case of implementing interface.
		try{Thread.sleep(50);} catch(Exception e){}	
		t2.start();
		
		//obj1.start();											//obj.start is used to start the thread.
		//try{Thread.sleep(50);} catch(Exception e){}			//this is used so that while working parallely there is a tiny time difference so that no two working of objects overlap.
		//obj2.start();											//Used in case of extending class "Thread".
		

	}

}

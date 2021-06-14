package newproject;
class calcul					//super,parent,base
{
	public int add(int i,int j)
	{
		return i+j;
	}
}

class calculadv extends calcul	//sub,child,derived
{
	public int sub(int i,int j)
	{
		return i-j;
	}
}

class calcuveryadv extends calculadv
{
	public int mult(int i,int j)
	{
		return i*j;
	}
}
public class InheritanceDemo {

	public static void main(String[] args)
	{
		calcuveryadv calc = new calcuveryadv();
		int result1 = calc.add(50,2);
		int result2 = calc.sub(50,2);
		int result3 = calc.mult(50,2);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
	}

}

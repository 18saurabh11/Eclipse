
public class IDS2
{
	int d,c=0,f=0;
	int n,m;
	public void IDS(int x)
	{
		while(x>0)
		{
			d=x%10;
			c=(c*10)+d;
			x=x/10;
		}
		//System.out.println(c);
		while(c>0)
		{
		m=c%10;
		n=c%100;
		if(m<n)
		{
			f=f+m;
		}
		c=c/10;
		}
		f=f+n;
		System.out.println(f);
		
		
	}

	public static void main(String[] args)
	{
		IDS2 obj = new IDS2();
		obj.IDS(12325);

	}

}

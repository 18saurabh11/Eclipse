

public class Increasing_digits_Sequence 
{
	public void IDS(int x)
	{
		int c=0;
		String S=Integer.toString(x);
		for(int i=0;i<S.length();i++)
		{
			for(int j=i+1;j<S.length()-i;j++)
			{
				if(S.charAt(i)<S.charAt(j))
				{
					char ch=S.charAt(i);
					int d=Integer.parseInt(String.valueOf(ch));
					c=c+d;
					break;
				}
			}
		}
		System.out.println(c);
		
	}

	public static void main(String[] args) throws Exception
	{
		Increasing_digits_Sequence obj1 = new Increasing_digits_Sequence ();
		obj1.IDS(13567);
	}

}

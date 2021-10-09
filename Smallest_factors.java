import java.util.*;
import java.io.*;
public class Smallest_factors 
{

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		int a,b;
		int i,j=0;
		int arr[]=new int[100];
		a=sc.nextInt();
		if(a<10)
		{
			b=a+10;
			System.out.print(b);
		}
		else
		{
		for(i=9;i>1;i--)
		{
			while(a%i==0)
			{
				a=a/i;
				arr[j]=i;
				j++;
			}
		}
		if(a>10)
		{
			System.out.println("Not Possible");
		}
		for(i=j-1;i>=0;i--)
		{
			System.out.print(arr[i]);
		}
		}
	}
}

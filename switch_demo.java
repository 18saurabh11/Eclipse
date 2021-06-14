package newproject;

public class switch_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4; // accepts 'char' values and accepts "string" values in 1.7 and above
		
		switch(n)
		{
		case 1:
			System.out.println("one");
			break; // so that remaining cases do not proceed after one has proceeded
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		case 4:
			System.out.println("four");
			break;
		case 5:
			System.out.println("five");
			break;
		default:
			System.out.println("not matched");
		}

	}

}

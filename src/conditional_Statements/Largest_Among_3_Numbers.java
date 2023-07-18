package conditional_Statements;

public class Largest_Among_3_Numbers {

	public static void main(String [] args) 
	{
		
		int a = 10;
		int b = 8;
		int c = 40;
		
		if (a > b) 
		{
			if (a > c) 
			{
				System.out.println( a + " Is the Largest Number!");
				
			} else { 
				System.out.println( c + " Is the Largest Number");
			}
		}else if(b > c)
		{
			System.out.println(b + " Is the Largest Number");
		}
		else 
		{
			System.out.println(c + " Is the Largest Number");
		}
		
	}
	}

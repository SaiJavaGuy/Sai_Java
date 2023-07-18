package conditional_Statements;

public class Leap_Year_Or_Not {

	public static void main(String [] args) {
		
		
		int y = 2008;
		int l = y%4;
		if (l == 0) {
			
				System.out.println(y + " Is a Leap Year.");
				
			}else {
				
				System.out.println(y + " Is not a Leap year");
			}
						
	}
}

package For_Loops;

public class While_Loops {

	public static void main(String []args) {
		
//		int i = 1 ;
//		while(1<20) {
//			if(i%2 == 0) {
//				System.out.println(i+ "is even ");
//			}
//		} i++;

		
		int n =37;
		boolean isPrime = true;	
		for(int i=2;1<=n/2; i++) {
			if (n %1==0) {
				System.out.println(n+"Is not Prime,Because it's divisible by " + i);
				isPrime = false;
				break ;
			}
		}
		if (isPrime) {
			System.out.println(n + "Is a Prime Number");
		}
		
	}
	
}

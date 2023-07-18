package Functions;

public class Sum_Of_Prime_Numbers {
	
	public static void main(String [] args) {
		int n = 2 ;
		int r = 0;
		while (n < 10) {
			public static boolean validatePrime(int n) {
				
			boolean isPrime = true;	
			for(int i=2;i<=n/2; i++) {
				if (n % i==0) {
					System.out.println(n+"Is not Prime,Because it's divisible by " + i);
					isPrime = false;
					break ;
		}
				
		}
			if (isPrime) {
				System.out.println(n + "Is a Prime Number");
				r = r+n;
	
		}
			n++;
		
	}
		System.out.println("Prime number: " + r);


		}

		
	}
	
	
}
	

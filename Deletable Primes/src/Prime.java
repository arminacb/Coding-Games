import java.math.BigInteger;

public class Prime {
	
	public static void main(String[] args) {
	
		
		/*int a1 = deletablePrimes( 4125673 );
		int a2 = deletablePrimes( 41256793 );
		int a3 = deletablePrimes(337424981);
		int a4 = deletablePrimes(537430451);
		int a5 = deletablePrimes(200899998);
		int a6 = deletablePrimes(537499093);
		int a7 = deletablePrimes(2147483059);
		int a8 = deletablePrimes(410256793);
		int a9 = deletablePrimes(567629137);
		long a = 46216567629137L;
		int a10 = deletablePrimes(a);
//		
//		
		System.out.println(a3);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		System.out.println(a5);
		System.out.println(a6);
		System.out.println(a7);
		System.out.println(a8);
		System.out.println(a9);
		System.out.println(a10);
	*/}
	
	
	public int deletablePrimes(long prime) {
		if (isPrime(prime)) {
			String numberString = Long.toString(prime);
		}
	}
	
	
	
	
	
	public static boolean isPrime(long tempLong) {
	    BigInteger bigInt = BigInteger.valueOf(tempLong);
	    return bigInt.isProbablePrime(100);
	}

}

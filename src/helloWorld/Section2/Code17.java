package helloWorld.Section2;

public class Code17 {

	public static void main(String[] args) {
		// 1~100000사이의 소수를 출력.

		for(int n=2; n<=100000; n++) {
			if(isPrime(n)) {
				System.out.println(n);
			}
		}
	}
	
	
	static boolean isPrime(int k) {
			if(k<2) { return false;}
			for(int i=2; i*i<=k; i++) {
				if(k % i == 0) {
					return false;	
				}
			}
			return true;
	
	}
	
}	

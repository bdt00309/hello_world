package helloWorld.Section1;

import java.util.Scanner;

public class Code13 {

	public static void main(String[] args) {
		// n개의 음이 아닌 한 자리 정수를 입력받아 배열에 저장, 0개 이상의 연속된 정수들을 더하여 얻을 수 있는 최대값 구하기


		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] data = new int[n];

		for(int i=0; i<n; i++) {
			data[i] = sc.nextInt();

		}
		sc.close();

		int max = 0;
		for(int i=0; i<n; i++) {
			for(int j=i;j<n;j++) {

				// convert data[i] ...data[]j into an integer
				int val =0;
				for(int k=i; k<=j; k++) 
					val =val * 10 + data[k];

				// test if is is a prime
				boolean isPrime = true;
				for(int k=2; k*k <= val && isPrime; k++) 
					if(val % k == 0 ) 
						isPrime = false;


				// if yes, compare to the max
				if(isPrime && val > 1 && val
						> max ) 
					max = val;
			}
		}
		
		if(max > 0) {
			System.out.println(max);
		} else {
			System.out.println("No prime number");
		}
		




	}

}

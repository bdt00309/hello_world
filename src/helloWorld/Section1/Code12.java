package helloWorld;

import java.util.Scanner;

public class Code12 {

	public static void main(String[] args) {
		// n개의 정수를 입력받아 배열에 저장, 0개 이상의 연속된 정수들을 더하여 얻을 수 있는 최대값 구하기
		
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] data = new int[n];
		
		for(int i=0; i<n; i++) {
			data[i] = sc.nextInt();
			
		}
		sc.close();
		
		int max = 0;
		for(int i=0; i<n; i++) {
			int sum =0;
			for(int j=i;j<n;j++) {
				sum += data[j];
				if(sum > max) {
					max = sum;
				}
			}
		}
		
		System.out.println(max);




	}

}

package study_java;

import java.util.Scanner;

public class P04 {

	public static void main(String[] args) {
		// 연속된 자연수 합 구하기
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int count = 1;
		int start_index = 1;
		int end_index = 1;
		
		int sum = 1;
		while(end_index !=N) {
			
			if(sum == N) {
				count++;
				end_index++;
				sum = sum+end_index;
			} else if(sum > N) {
				sum = sum - start_index;
				start_index++;
			} else {
				end_index++;
				sum = sum+end_index;
			}
		}
		
		System.out.println(count);
		
		
		

	}

}

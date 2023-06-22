package helloWorld;

import java.util.Scanner;

public class Code11 {

	public static void main(String[] args) {
		// 정수 n개 입력받아서 순서대로 배열에 저장, 중복된 정소 쌍의 개수를 카운트하여 출력
		
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] data = new int[n];
		
		for(int i=0; i<n; i++) {
			data[i] = sc.nextInt();
			
		}
		sc.close();
		
		int count = 0;
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				// data[i], data[j]
				if(data[i] == data[j]) {
					count++;
				}
			}
		}
		System.out.println(count);





	}

}

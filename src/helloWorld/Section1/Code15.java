package helloWorld.Section1;

import java.util.Scanner;

public class Code15 {

	public static void main(String[] args) {
		// 정렬; 사용자로부터 n개의 정수를 입력받은 후, 정수 하나씩 입력될 때마다 현재까지 입력된 정수들을 오름차순으로 정렬하여 출력ㄴ

		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] data = new int[n];

		for(int i=0; i<n; i++) {
			int tmp = kb.nextInt();

			int j = i-1;
			while(j >= 0 && data[j] > tmp) {
				data[j+1] = data[j];
				j--;
			}
			data[j+1] = tmp;

			for(int k=0; k <= i; k++ ) {
				System.out.print(data[k] + " ");
				System.out.println();
			}
		}
		kb.close();
	}

}

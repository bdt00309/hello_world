package helloWorld.Section2;

import java.util.Scanner;

public class Code16 {

	public static void main(String[] args) {
		// 입력으로 두 정수 a와 b를 받아 a의 b승을 계산한다.

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		int result = power(a, b);

		System.out.println(result);
		sc.close();
	}

	static int power(int a, int b) {
		int prod = 1;
		for(int i=0; i<b; i++) {
			prod = prod * a; //prod *= n;랑 동일함 
		}
		return prod;
	}

}

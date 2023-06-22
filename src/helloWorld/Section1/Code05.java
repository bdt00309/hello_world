package helloWorld.Section1;

public class Code05 {

	public static void main(String[] args) {

		int[] grades;
		grades = new int[5];

		double[] array;
		array = new double [100];

		char[] word = new char[20];

		grades[0] = 100;
		grades[1] = 76;
		grades[2] = 92;
		grades[3] = 95;
		grades[4] = 14;

		/*
		 * System.out.println(grades[0]); System.out.println(grades[1]);
		 * System.out.println(grades[2]); System.out.println(grades[3]);
		 * System.out.println(grades[4]);
		 */


		for(int i=0; i<grades.length; i++) {
			System.out.println("grade " + (i+1)+ ": " + grades[i]);

		}

	}

}

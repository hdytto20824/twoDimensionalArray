package twoDimensionalArray;

import java.util.Scanner;

public class twoDimensionalArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Student:");
		int student = scanner.nextInt();
		System.out.print("Subject:");
		int subject = scanner.nextInt();
		int[][] scoreTable = new int[student][subject];

		for (int i = 0; i < student; i++)
			for (int j = 0; j < subject; j++) {
				System.out.printf("Student%d Subject%d Score：", i + 1, j + 1);
				int input = scanner.nextInt();
				scoreTable[i][j] = input;
			}

		for (int i = 0; i < subject; i++)
			System.out.printf("     Subject%d", i + 1);
		System.out.println();

		for (int i = 0; i < student; i++) {
			System.out.printf("Student%d  ", i + 1);
			for (int j = 0; j < scoreTable[0].length; j++) {
				System.out.print(scoreTable[i][j] + "   ");
			}
			System.out.println();
		}
	}
}
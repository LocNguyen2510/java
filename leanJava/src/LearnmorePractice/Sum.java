package LearnmorePractice;

import java.util.Scanner;

public class Sum {
	public static void bcd(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n;
		n = scanner.nextInt();
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum = sum + i;
		}
		scanner.close();
	}
}
package JavaAdvance_Day1_exception;

import java.util.Scanner;

public class exception {
	public static void main(String[] args) {
		int[] a = new int[3];
		Scanner scanner = new Scanner(System.in);
		try {
			for (int i = 0; i < a.length; i++) {
				System.out.printf("nhap array: [%d]=  ", i);
				a[i] = scanner.nextInt();

			}

		} catch (Exception e) {
			System.out.println("loi");
		} finally {
			System.out.println(a.toString());
		}

	}
}

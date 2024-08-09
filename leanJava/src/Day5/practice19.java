package Day5;

import java.util.Scanner;

public class practice19 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập vào số cần tính nguyên tố: ");
		int songuyen = scanner.nextInt();
		int count = 0;
		for (int i = 2; i < songuyen; i++) {
			if (songuyen % i == 0) {
				count++;
				System.out.println("Ước số khác:" + i);
			}
		}

		if (count != 0) {
			System.out.println(songuyen + " không phải là số nguyên tố");
		} else {
			System.out.println(songuyen + " là số nguyên tố");

		}
		scanner.close();
	}
}

package day3;

import java.util.Scanner;

public class practice10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Giải phương trình bậc nhất: ");

		System.out.println("nhập A");
		float a = scanner.nextFloat();
		System.out.println("nhập B");
		float b = scanner.nextFloat();
		System.out.printf("Giải phươn trình %.0fx + %.0f \n", a, b);
		if (a == 0 && b == 0) {
			System.out.println("Phươn trình vô số nghiệm");
		} else if (a == 0 && b != 0) {
			System.out.println("Phươn trình vô nghiệm");
		} else {
			float x = -b / a;
			System.out.println("X=" + x);
		}
		scanner.close();

	}
}

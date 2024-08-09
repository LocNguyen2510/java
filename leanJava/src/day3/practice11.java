package day3;

import java.util.Scanner;

public class practice11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Giải phương trình bậc hai: ");
		System.out.println("Nhập số A :");
		int a = scanner.nextInt();
		System.out.println("Nhập số B :");
		int b = scanner.nextInt();
		System.out.println("Nhập số c :");
		int c = scanner.nextInt();
		System.out.printf("Tính phương trình %dx^2 + %dx + %d =0 \n", a, b, c);
		if (a == 0) {
			if (b == 0 && c == 0) {
				System.out.println("Phươn trình vô số nghiệm");
			} else if (b == 0 && c != 0) {
				System.out.println("Phươn trình vô nghiệm");
			} else {
				float x = (float) -c / b;
				System.out.println("X=" + x);
			}
		} else {
			float delta = (float) Math.pow(b, 2) - 4 * a * c;
			if (delta < 0) {
				System.out.println("Phương trình vô nghiệm");
			} else if (delta == 0) {
				System.out.println("Phương trình có nghiệm kép: X=" + -b / (2 * a));
			} else {
				System.out.println("Phương trình có 2 nghiệm riêng biệt: \n X1=" + (-b + Math.sqrt(delta)) / (2 * a)
						+ "\n X2=" + (-b - Math.sqrt(delta)) / (2 * a));
			}
		}
		scanner.close();
	}
}

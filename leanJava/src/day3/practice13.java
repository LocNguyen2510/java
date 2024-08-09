package day3;

import java.util.Scanner;

public class practice13 {
	public static void bacMot(String[] args) {
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

	public static void bacHai(String[] args) {
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

	public static void tinhTienDien(String[] args) {
//		tính số điện nếu số điện trong nhà <100 thì số điện * 1000 và nếu hơn 100 thì từ số điện 100 trở lên sẽ *1500 vd số điện = 150 thì 100*1000 + 50*1500
		Scanner scanner = new Scanner(System.in);
		System.out.println("Tính số tiền điện: ");
		System.out.println("Nhập số điện bạn cần tính: ");
		int sodien = scanner.nextInt();
		if (sodien <= 100) {
			System.out.println("số tiền bạn cần phải trả là: " + sodien * 1000);
		} else {
			System.out.println("số tiền bạn cần phải trả là: " + (100 * 1000 + (sodien - 100) * 1500));
		}
		scanner.close();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
		System.out.println("++ ----------------------------------------- ++");
		System.out.println("| 1. Giải phương trình bậc nhất |");
		System.out.println("| 2. Giải phương trình bậc hai |");
		System.out.println("| 3. Tính số tiền điện |");
		System.out.println("| 4. Kết thúc |");
		System.out.println("++ ------------------ ++");

		System.out.println("Tính năng bạn chọn là ?");
		int tinhnang = scanner.nextInt();
		switch (tinhnang) {
		case 1:
			bacMot(args);
			break;
		case 2:
			bacHai(args);
			break;
		case 3:
			tinhTienDien(args);
			break;
		default:
			System.out.println("Bạn đã thoát chương trình");
			System.exit(0);
			scanner.close();
		}
	}
}

package day3;

import java.util.Scanner;

public class practice9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập số tiền lương của bạn");
		int tax = scanner.nextInt();
		if (tax < 10000) {
			System.out.println("Không cần đóng thuế");
			System.out.println("Số tiền bạn nhận được là : " + tax);
		} else if (tax >= 10000 && tax <= 15000) {
			System.out.println("Số tiền cần đóng thuế là 10%: " + tax * 0.1);
			System.out.println("Số tiền bạn nhận được là : " + tax * 0.9);
		} else if (tax > 15000 && tax <= 30000) {
			System.out.println("Số tiền cần đóng thuế là 20%: " + tax * 0.2);
			System.out.println("Số tiền bạn nhận được là : " + tax * 0.8);
		} else {
			System.out.println("Số tiền cần đóng thuế là 50%: " + tax * 0.5);
			System.out.println("Số tiền bạn nhận được là : " + tax * 0.5);
		}
		scanner.close();
	}
}

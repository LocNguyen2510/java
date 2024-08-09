package day3;

import java.util.Scanner;

public class practice12 {
	public static void main(String[] args) {
//	tính số điện nếu số điện trong nhà <100 thì số điện * 1000 và nếu hơn 100 thì từ số điện 100 trở lên sẽ *1500 vd số điện = 150 thì 100*1000 + 50*1500
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
}

package LearnmorePractice;

import java.util.Scanner;

public class NhanTu1Den20 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x;
		System.out.println("Nhap x");
		x = scanner.nextInt();
		for (int i = 1; i < 21; i++) {

			System.out.println(x + "*" + i + "=" + x * i);
		}
	}

}

package LearnmorePractice;

import java.util.Scanner;

public class TimNguyenTo1denN {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		boolean soNguyenTo;
		System.out.println("Nhap n");
		n = scan.nextInt();
		for (int i = 3; i < n; i++) {
			soNguyenTo = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					soNguyenTo = false;
				}

			}
			if (soNguyenTo == true) {
				System.out.println(i + " La So Nguyen To");
			}

		}
	}
}

package LearnmorePractice;

import java.util.Scanner;

public class TamGiacVuong {
	public static void abc(String[] args) {
		int a, b, c;
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhap a");
		a = scan.nextInt();
		System.out.println("Nhap b");
		b = scan.nextInt();
		System.out.println("Nhap c");
		c = scan.nextInt();
		if (a + b > c && b + c > a && c + a > b) {
			System.out.println("Ba số đúng là 3 cạnh của 1 tam giác");
		} else {
			System.out.println("Ba số không phải là 3 cạnh của 1 tam giác");
		}
		scan.close();

	}

}

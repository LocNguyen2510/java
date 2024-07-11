package day3;

import java.util.Scanner;

public class pratice8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap canh cua khoi lap phuong: ");
		int canh = scanner.nextInt();
		System.out.println("the tich khoi lap phuong la: " + Math.pow(canh, 3));
		scanner.close();
	}
}

package Day2;

import java.util.Scanner;

public class pratice7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap chieu dai: ");
		int chieudai = scanner.nextInt();
		System.out.println("nhap chieu rong: ");
		int chieurong = scanner.nextInt();
		System.out.println("chu vi hinh chu nhat la: " + (chieudai + chieurong) * 2);
		System.out.println("dien tich hinh chu nhat la: " + chieudai * chieurong);
		System.out.println("Canh nho nhat la: " + Math.min(chieudai, chieurong));
		scanner.close();
	}
}

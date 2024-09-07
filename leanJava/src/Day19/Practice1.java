package Day19;

import java.util.Scanner;

public class Practice1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("Nhap X= ");
			try {
				int x = scanner.nextInt();
				try {
					System.out.println("ket qua la:" + 10 / x);
					break;
				} catch (Exception e) {

					System.out.println("khong nhap x = 0");

					continue;
				}
			} catch (Exception e) {
				scanner.next();
				System.out.println("Khong nhap chữ");

			}

		}
	}
}

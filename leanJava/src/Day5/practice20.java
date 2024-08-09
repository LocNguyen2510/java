package Day5;

import java.util.Scanner;

public class practice20 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập số cần nhân:");
		int soNhan = scanner.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d X %d = %d \n", soNhan, i, soNhan * i);
		}

		scanner.close();
	}
}

package LearnmorePractice;

import java.util.Scanner;

public class MSSV {
	public static void main(String[] args) {
		String MSSV;
		System.out.println("Nhập vào MSSV:");
		Scanner sc = new Scanner(System.in);

		MSSV = sc.nextLine();

		if (MSSV.matches("B\\d{7}"))
			System.out.println("Phù hợp");
		else
			System.out.println("Không phù hợp");
		sc.close();
	}
}

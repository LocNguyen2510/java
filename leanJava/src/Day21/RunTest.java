package Day21;

import java.util.Scanner;

public class RunTest extends SinhVien {
	public RunTest(int masv, String hoten, double diem, int age) {
		super(masv, hoten, diem, age);
		// TODO Auto-generated constructor stub
	}

	public static int nhapMSSV() {
		int masv = 0;
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("nhap ma sinh vien: ");

			try {
				masv = scanner.nextInt();
				break;
			} catch (Exception e) {
				System.out.println("Sai kí tự. Vui lòng nhập lại số nguyên");
				scanner.next();
			}

		}
		scanner.close();
		return masv;

	}

	public static String nhapTen() {
		String hoten;
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("nhap ten sinh vien: ");
			try {
				hoten = scan.nextLine();
				break;
			} catch (Exception e) {
				System.out.println("Sai kí tự. Vui lòng nhập lại ten");
				scan.next();
			}

		}
		scan.close();
		return hoten;

	}

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int masv = nhapMSSV();
			String hoten = nhapTen();
			System.out.println("massv la: " + masv);
			System.out.println(hoten);
		}
	}
}

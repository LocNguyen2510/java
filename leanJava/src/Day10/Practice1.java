package Day10;

import java.util.Scanner;

public class Practice1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("nhập tên username: ");
			String name = scanner.nextLine();
			System.out.println("nhập tên password: ");
			String password = scanner.nextLine();
			if (name.equals("dinhloc") && password.length() > 6) {
				System.out.println("Dung dinh dang");
				System.out.println("Username: " + name.toString() + "\nPassword " + password.toString());
				break;
			} else {
				System.out.println("sai dinh dang");
				System.out.println("nhan enter de nhap lai");
				scanner.nextLine();
			}

		}
		scanner.close();
	}
}

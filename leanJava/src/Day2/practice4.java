package Day2;

import java.util.Scanner;

public class practice4 {

	public static void main(String[] agrs) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Your name:");
		String name = scanner.nextLine();
		System.out.println("Your age:");
		int age = scanner.nextInt();
		System.out.println("My name is: " + name + ", age: " + age);
		scanner.close();

	}

}

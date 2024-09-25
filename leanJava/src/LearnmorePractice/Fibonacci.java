package LearnmorePractice;

import java.util.Scanner;

public class Fibonacci {
	public int CalculateFi(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}
		return CalculateFi(n - 1) + CalculateFi(n - 2);
	}

	public static void main(String[] args) {
		int n;
		int Fi;
		System.out.println("Nhập vào số nguyên:");
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();

		Fibonacci fibonacci = new Fibonacci();
		Fi = fibonacci.CalculateFi(n);

		System.out.println("Fi(" + n + ") = " + Fi);
		sc.close();
	}

}
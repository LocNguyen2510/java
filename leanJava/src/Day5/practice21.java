package Day5;

import java.util.Arrays;
import java.util.Scanner;

public class practice21 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập số lượng số sẽ nhập: ");
		int size = scanner.nextInt();
		int[] a = new int[size];
		System.out.println("Nhập phần tử: ");
		for (int i = 0; i < size; i++) {
			a[i] = scanner.nextInt();

		}
		System.out.println("Array ban đầu: " + Arrays.toString(a));
		Arrays.sort(a);
		System.out.println(Arrays.stream(a).sum());

		System.out.println("Array sau khi sắp xếp: " + Arrays.toString(a));
		System.out.println("Số nhỏ nhất là : " + a[0]);
		System.out.println("Số lớn nhất là: " + a[size - 1]);
//	C2:	System.out.println("Số lớn nhất là: " + a[a.length - 1]);
//	C3:	int max = 0;
//		for (int i = 0; i < a.length; i++) {
//			max = Math.max(max, a[i]);
//		}
//		System.out.println("Số lớn nhất là :" + max);
		scanner.close();

	}
}

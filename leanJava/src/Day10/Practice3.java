package Day10;

import java.util.ArrayList;
import java.util.Scanner;

public class Practice3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Practice2 in1 = new Practice2("Nguyen Dinh Loc", 1);
		Practice2 in2 = new Practice2("Pham Dinh Loc", 2);
		Practice2 in3 = new Practice2("Phan Dinh Loc", 3);
		Practice2 in4 = new Practice2("Nguyen Văn Loc", 4);
		Practice2 in5 = new Practice2("Do Dinh Nguyen", 5);
		ArrayList<Practice2> array = new ArrayList<>();
		array.add(in1);
		array.add(in2);
		array.add(in3);
		array.add(in4);
		array.add(in5);
		System.out.println(array);
		for (int i = 0; i < array.size(); i++) {
			if (array.get(i).getName().startsWith("Nguyen")) {
				System.out.println(array.get(i));
			}
		}

	}
}

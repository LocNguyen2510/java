package Day9;

import java.util.ArrayList;

public class Practice1 {
	public static void main(String[] args) {

		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("Nguyen Dinh Loc");
		a1.add("arrayList");
		a1.add("Sourt");
		a1.remove(1);
		System.out.println(a1.toString() + " " + " " + a1.get(1) +" "+ a1.size());

	}
}

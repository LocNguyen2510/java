package Day11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Practice1 {
	public static void main(String[] args) {
		System.out.println("run p1");
		Pattern pattern = Pattern.compile("[(0-9 a-z A-Z]{6,}");
		Matcher matcher = pattern.matcher("NGUYENDIN123");
		System.out.println(matcher.matches() + " " + matcher);
	}
}

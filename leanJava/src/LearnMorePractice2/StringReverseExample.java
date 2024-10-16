package LearnMorePractice2;

public class StringReverseExample {
	public static void main(String[] args) {
		String string = "abcdef123456";
		String reverse = new StringBuffer(string).reverse().toString();
		System.out.println("String before reverse: " + string);
		System.out.println("String after reverse: " + reverse);
	}
}
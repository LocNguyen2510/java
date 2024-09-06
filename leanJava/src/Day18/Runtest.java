package Day18;

public class Runtest {
	public static void main(String[] args) {
		Student st = new Student("15", "Loc", 23, 3);
		System.out.println(st);
		st.setGrade();
		System.out.println(st);
		Person pr = new Person("12", "Loc", 22);
		System.out.println(pr);
	}
}

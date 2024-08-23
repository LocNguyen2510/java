package Day12;

public class Practice2 extends Practice1 {
	private String name = "Mustang";

	public static void main(String[] args) {
		Practice2 car = new Practice2();
		car.pr();
		System.out.println("Car: " + car.brand + " " + car.name);
	}
}

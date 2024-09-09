package Day24;

public class Practice1 extends Thread {
	public void run() {
		System.out.println("start run");
		long sum = 0l;
		for (int i = 0; i < 1000000000; i++) {
			sum = +i;
		}
		System.out.println("end run");
	}

	public static void main(String[] args) {
		int count = 100;
		for (int i = 0; i < count; i++) {
			(new Practice1()).start();
			System.out.println("run practice1");
		}
	}
}

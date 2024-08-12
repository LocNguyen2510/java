package Day7_1;

import Day7.P;

public class P2 extends P {
	private void test() {
		P firstObj = new P();
		firstObj.a = 10; // là public nên có thể kế thừa hoặc gọi ở mọi nơi
//		firstObj.b = 10;  dạng default nên không kế từ hay có thể gọi (chuyển về proteced
		super.c = 10; // protected nên kế thừa từ extend P
//		firstObj.d = 10;  là private nên không thể kế thừa
	}

	public static void main(String[] args) {

	}
}

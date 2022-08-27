package day33abstractclass;

public class Test2 extends Test {
	int b = 10;

	Test2() {

		b = super.b;

	}

	void getNumber(int x, int y) {

		int i = x * y + b;

		System.out.print(i);

	}

	public static void main(String[] args) {

		Test2 sub = new Test2();

		sub.getNumber(7, 3);

	}
}

package day24varargsaccessmodifiers;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	static void m2(String str, int... a) {

		System.out.println(str);

		for (int i : a) {

			System.out.print(i + " ");

		}

		System.out.println();

	}
}

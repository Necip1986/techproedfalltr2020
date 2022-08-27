package day08ternary;

public class NestedTernaryOperators {

	public static void main(String[] args) {
		
		int y=8;
		int input=(y>5) ? (y<10 ? 2*y : 3*y) : (y>10 ? 2+y : 3+y);
		System.out.println(input);
		
		
		int k=12;
		int sonuc= k> 5 ? (k<10 ? 2*k : 3*k) : (k>10 ? 2+k : 3+k);
		System.out.println(sonuc);
		
		
		int x=5;
		int sayi= x>5 ? (x<10 ? 2*x : 3*x) : (x>10 ? 2+x : 3+x);
		System.out.println(sayi);

		
		
		
		

	}

}

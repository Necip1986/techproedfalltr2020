package day40lambda;

import java.util.stream.IntStream;

public class LambdaTekrar03 {

	public static void main(String[] args) {
		
		//ilk 10 7 ile bolunebilen pozitif tamsayilarin toplamini ekrana yazdiriniz
		System.out.println(IntStream.iterate(7, t->t+7).limit(10).sum());
		
		topla(10);

	}
	public static void topla(int x) {
		int y=IntStream.iterate(7, t->t+7).limit(x).sum();
		System.out.println(y);
		
	}

}

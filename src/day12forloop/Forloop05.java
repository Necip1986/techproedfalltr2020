package day12forloop;

public class Forloop05 {

	public static void main(String[] args) {
		/*
		 * 18 den 3 e kadar tum tamsayilarin toplamini ekrana yazdiran programi yaziniz
		 */

		int toplam=0;
		
		for(int i=18; i>=3; i--) {
			toplam=toplam+i;
		}
		System.out.println("Toplam: "+toplam);
	}

}

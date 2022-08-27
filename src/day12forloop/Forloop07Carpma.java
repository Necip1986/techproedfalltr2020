package day12forloop;

public class Forloop07Carpma {

	public static void main(String[] args) {
		/*
		 * 3'den 6'ya kadar tum tamsayilarin carpimini hesaplayan programi yaziniz.
		 */
		
		//ilk olarak tahmini sonuc icin memory de bir yer ayirmaliyiz
		
		int carpim=1; //carpmada hep 1 dicez 0 toplamanin etkisiz elemani 1 ise carpmanin etkisiz elemanidir.
		
		for(int i=3; i<=6; i++) {
			carpim=carpim*i;
		}
		
		System.out.println("Carpim: "+carpim);
	}

}

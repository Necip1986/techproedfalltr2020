package day12forloop;

public class Forloop04 {

	public static void main(String[] args) {
		/*
		 * 5'den 12 ye kadar tum tamsayilarin toplamini hesaplayip ekrana yazdiran programi yaziniz
		 */

		int toplam=0; //aksi soylenmedikce 0 atamasi yapariz. cunku bu sayilar toplandiginda hafiza da bir yere konmali
			
		for(int i=5; i<=12; i++) {
			toplam=toplam+i;  //atama islemi yapilir ilk once 0+5 daha sonra 5+6 daha sonra 11+7 .....i=12 olana kadar devam eder
			//System.out.println("Toplam: "+toplam);      //loop larda artirma kod calistiktan sonra oluyor. loop tekrar demektir
		}
		System.out.println("Toplam: "+toplam);  //syso for dongusu disina konmali tum adimlar bittikten sonra sonucu vericek bize
		                                        //eger icine koyarsak tum dongunun hepsini goruruz. final en son sonucu gormek icin disina yazariz
	}

}

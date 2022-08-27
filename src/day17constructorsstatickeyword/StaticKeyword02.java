package day17constructorsstatickeyword;

public class StaticKeyword02 {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
		System.out.println(StaticKeyword01.gender); //sadece class ureterek static lere ulasabiliriz ama object olusturmadan static olmayanlara
		                                            //ulasamayiz
		System.out.println(StaticKeyword01.k);

		StaticKeyword01 obj1=new StaticKeyword01();
		System.out.println(obj1.i);
		System.out.println(obj1.name); //instance'lara ulasmak icin object olusturmaliyiz.
		
		System.out.println(obj1.gender); //object olusturarak ta static'e ulasabiliriz ama java sari uyari verir ne gerek var diyor.
		System.out.println(obj1.k);
		
		//static olanlara sadece class ismi kullanarak ulasabiliriz
		//instance olanlara ulasmak icin obje uretmek zorundayiz
		//static olanlara obje uzerinden ulasabiliriz ama tavsiye edilmez
		
	}

}

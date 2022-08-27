package day25stringbuilder;

public class StringBuilder01 {

	/*
	  1-String class'i "immutable"dir (degistirilemez). Java mutable (degistirilebilir) String'ler
	    uretebilmemiz icin String Builder isimli bir class uretti.
	  2-Java'da String Builder ile hemen hemen ayni isi yapan bir de "StringBuffer" class'i var. 
	    StringBuffer class'i String Builder class'indan daha once uretilmisti. StringBuffer yavas calisan bir
	    class'dir. StringBuilder hizli calisir. 
	    StringBuffer synchronize islemlerini yapabilir ama StringBuilder yapamaz. StringBuffer daha ozelliklidir. bundan
	    dolayi yavas calisir. Synchoronize ne demek ayni anda bircok is yapabilmesidir.
	  3-Ayni anda bir cok isin yapilmasina "multi threading" denir. multi=cok thread=yapilan islerin herbiri
	    Multi threading varsa, bu islerin siraya konulmasi lazim. Islerin siraya konmasina "synchronization" denir.
	 */
	public static void main(String[] args) {
		
		String str = "Learn";
		
		concat(str); //LearnX
		
		System.out.println(str);//Learn concat kalici degisiklik yapmadi
		//String'lerde method kullanarak String'i degistirmek atama yapmadan mumkun degildir. Bunun 2 nedeni var
		//1- Java pass-by-value kullanir. Ornekte goruldugu gibi str degerini degistirmek icin bir method olusturdum
		//ama yine degistiremedim
		//2- String class'i immutable class'dir.
		 

	}
	
	public static void concat(String str) {
		System.out.println(str+"X");
	}

}

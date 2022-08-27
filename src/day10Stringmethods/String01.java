package day10Stringmethods;

public class String01 {

	public static void main(String[] args) {
		/*
		 * 4. method: endswith metodu
		 * 
		 */

		String s1="Testi al kendini gor";
		
		s1.endsWith("r"); //yazdirirsak true olur string r ile biter dogru mu? evet
		System.out.println(s1.endsWith("r"));
		
		System.out.println(s1.endsWith("gor"));// endswith coklu karakterleri de kabul eder true der
		
		System.out.println(s1.endsWith(""));//hicbirseyi de true kabul eder
		
		System.out.println(s1.endsWith("kendini gor"));//bunu da kabul eder. hatta 
		
		System.out.println(s1.endsWith("Testi al kendini gor")); //butun cumleyi de dogru kabul eder
		
		//***bu method sadece Stringle calisir. Char ile calismaz.
		
		
		/*
		 * 5.method:equals methodu
		 * 
		 */
	
		System.out.println("Ali".equals("Ali")); //true der Ali Ali ye esit
		System.out.println("Ali".equals("ALI")); //false verir= buyuk kucuk harf onemli
		System.out.println("Ali"=="Ali");//true der
		
		
		/*
		 * 6. Method: equalsIgnoreCase Methodu====> java kucuk harf buyuk harf dikkate almaz
		 */
		"Ali".equalsIgnoreCase("Ali"); 
		System.out.println("Ali".equalsIgnoreCase("Ali"));//true yazdirir
		System.out.println("Ali".equalsIgnoreCase("ALI"));//true yazdirir buyuk harf kucuk harf onemsemez
		
	
		/*
		 * 7.Method:indexof() metodu
		 * indexof metodu indexi sorulan char'in string icindeki ilk gorunumunun indexini return eder.
		 * indexof metodunda hem char hemde String kullanilabilir.
		 * indexof metodunda birden fazla karakterin indexi sorulursa ilk karakterin indeksi return edilir.
		 */
		
		//String s1="Testi al kendini gor";
		s1.indexOf('i'); //i 'nin indexi diye okunur. ilk i'nin indexini yollar
		System.out.println(s1.indexOf('i'));//String s1="Testi al kendini gor"; ilk i ye kadar sayar index 4 olur
		System.out.println(s1.indexOf('T')); // O VERIR
		System.out.println(s1.indexOf(' ')); // ilk bosluk 5'te
		System.out.println(s1.indexOf("al"));// String ile calistirilirsa al de iki indexi var indexof ilk indexi ali yani "a"'nin indexini alir 6dir
	                                         //ilk karakterin indexini verir
		System.out.println("=====");
		s1.indexOf('x'); //olmayan karakter icin -1 return eder
		System.out.println(s1.indexOf('x')); //stringin icinde x yok ise -1 return eder
		System.out.println(s1.indexOf(""));//0 verir hicbirsey heryerdedir. basta vardir o halde 0 verir. charlarda hicbirsey yok stringlerde vardir
		                                   //'' hata verir"" sifir verir
		
		/*
		 * 8.Method:indexof 4 tane metodu var hepsini gorduk
		 */
		
		String s2="Cabuk ogrenilen cabuk unutulur";
		s2.indexOf('a', 6);
		System.out.println(s2.indexOf('a', 6)); //17 verir. indexof ilk karakteri verdigi icin bu method ile digerlerini bulabiliyoruz
		s2.indexOf('r', 8);//8 verir. 8'i icine alan bir dikdortgen ciziyoruz ilk olarak ordan basliyoruz.
		System.out.println(s2.indexOf('r', 8));
		
		s2.indexOf("buk", 5);
		System.out.println(s2.indexOf("buk", 5)); //18 verir ilk harfin indexisini soyler o da b harfinin index sidir.
		
		
		/*
		 * 9.method:isEmpty metodu
		 * isEmpty metodundan true aliyorsaniz o String'in icinde hicbir karakter yok demektir. yani o String 'in lenght'i 0'dir.
		 * bir String bos mu degil mi onu anliyoruz.
		 */
		
		String s3="Tekrar et tekrar unutma";
		s3.isEmpty(); //bos mu yani hic karakter yok mu diye soruyor java buna hayir yani false der
		System.out.println(s3.isEmpty());//false verdi
		
		"".isEmpty();
		System.out.println("".isEmpty());// true verir yani hic karakter yok
		
		/*
		 * 10.Method:lastIndexOf(): indexi sorulan karakterin son gorunumunun index ini return eder.
		 */
		
		s3.lastIndexOf('e'); //e'nin son index i nedir diye okunur.
		System.out.println(s3.lastIndexOf('e')); //11 verir son e'nin index ini verir.
		System.out.println(s3.lastIndexOf('T'));//buyuk kucuk harfe duyarli 0 verir
		
		s3.lastIndexOf("rar");
		System.out.println(s3.lastIndexOf("rar")); //13 verir ilk harfin index ini verir. son r'nin indexi
		
		s3.lastIndexOf('r', 16);
		System.out.println(s3.lastIndexOf('r', 16));//ilk 16 yi dikdortgene alir o 16 icinde son r'nin index ini alir o da 15'tir.
		
		System.out.println(s3.lastIndexOf("k", 14)); //12 verir
		
		
		/*
		 * 11. Method:lenght() metodu bir String deki karakterlerin sayisini verir. lenght en az 0 olur negatif olmaz.
		 */
		//String s3="Tekrar et tekrar unutma";
		
		System.out.println(s3.length());//23 verir karakter sayisini verir. 
		
		
		/*
		 * 12.Method:replace Metodu=yerine koyma metodu. birseyi al yerine baskasini koy demektir.
		 * char ve string ile kullanilabilir
		 */
		
		s3.replace('e', 'E');
		System.out.println(s3.replace('e', 'E')); //e leri buyuk E lere donusturur.
		System.out.println(s3.replace('x', 'M')); //olmayan bir seyi degistir dersek hicbir seyi degistirmez hata vermez aynisini verir
		
		System.out.println(s3.replace("krar","miz" )); //4 harfin yerine 3 harf koyar mi evet koyar istersek 100 harfin yerine 1 harf koyabilir
	
		System.out.println(s3.replace("a", "")); //burada a'lari siler. yani bir string karakteri imha etmek istiyorsak replace metodunu kullanabilir
		                                         //char larda hicbirsey kullanilmaz ancak string de kullanabiliriz.
		System.out.println(s3.replace(" ", ""));// tum bosluklari ortadan kaldirir
		
		System.out.println(s3.replace("", "|"));// her karakterin basina cubuk koyar. baslangic ta da cubuk ile baslar
		
		
		/*
		 * 13. Method: replaceAll methodu: sadece String ler calisir. charlar calismaz 
		 */
		String s4="Code1 yazarak2 ogrenilir3";
		
		/*
		 * Regular Expression(regex): butun harleri yildiza cevir veya tum rakamlari yildiza cevir gibi
		 * belli turdeki karakterleri secebilmemize yarar.
		 * 1) \\d ==> regular expression ==>tum rakamlar (ingilizce rakam digit demek)
		 *     \\D    ===> Tum rakam disi karakterleri (D isareti rakam olmayanlari demektir)	
		 * 2) \\w ====> word demek A->Z a->z 0->9  olan tum karakterler kastedilir. space ler olmaz onlari donusturemez 
		 *     \\W ====>  	 bosluklar degisir
		 * 3) \\s ===> s=space demektir. sadece space leri degistirir
		 *    \\S ===> space disindakileri donusturur
		 */
		
		s4.replaceAll("\\d", "*");
		System.out.println(s4.replaceAll("\\d", "*"));
		System.out.println(s4.replaceAll("\\D", "*")); // rakam disindakiler yildiz oldu.
		
		System.out.println(s4.replaceAll("\\w", "*")); //herseyi gorunmez yapar sadece space ler kaldi
		System.out.println(s4.replaceAll("\\W", "*")); // bosluklar yildiz oldu
		
		System.out.println(s4.replaceAll("\\s", "*")); //space ler yildiz olur
		System.out.println(s4.replaceAll("\\S", "*")); // space disindakiler yildiz olur
		
		
		/*
		 * 14. Method: startsWith ler sadece stringler ile calisir char ile calismaz
		 */
		s4.startsWith("C"); //true verir
		System.out.println(s4.startsWith("C")); // true verir C ile baslar diye okunur
		System.out.println(s4.startsWith("c")); // false verir kucuk buyuk harf duyarlidir.
		System.out.println(s4.startsWith("Code")); // true verir
		
		//s4 Stringinin 4. karakteri "e" midir. index 3 demektir.
		System.out.println(s4.startsWith("e",3)); //true verir
		
		
		
	}           

}

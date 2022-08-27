package day15variabletypesmethodcreation;

public class VariableTypes {
     
	//ilk defa main metod disinda variable olusturduk
	/*
	 *          INSTANCE VARIABLE
	 1-Main methodun ve urettigimiz diger methodlarin disinda (altinda veya ustunde), class'in icinde  
	   olusturulan variable'lara "instance variable" denir
	 2-Instance variable'lar obje olusturulurken olusturulur ve her objeye bu variable'lar monte edilir.
	 3-Instance variable'lara deger atamasi yapsaniz da olur yapmasaniz da olur
	   Asagida goruldugu gibi "i" variable'ina deger atamasi yaptim. "k" variable'ina yapmadik
	   Note:Bir variable'a deger atamasi yapma "initialize"(baslatma gibi) olarak adlandirilir.	 
	   "i" variable'i initialize edildi, digerleri edilmedi.
	 4-Initialize edilmeyen "instance variable"lar icin Java kendisi deger atamasi yapar,.
	   Javanin instance variable'lara kendisinin verdigi degerlere "default value" denir.
	   Java tum tamsayi iceren variable'lara default olarak 0 degerini atar.
	   byte, short, int, long icin default value 0'dir
	   float ve double icin default value 0.0'dir
	   char icin default value 0'dir
	   boolean icin default value false'dur.
	   String icin default value null'dir.
	 
     */
	int i=12;
	int k;
	String s;
	boolean b;
	double d;
	char ch;
	/*
	                          LOCAL VARIABLE
	 1-Main methodun veya olusturdugumuz baska bir methodun icinde olusturulan variable'lara local variable denir
	 2-Local variable'lara deger atamasi yapmak zorundayiz. aksi takdirde o variable'i kullanamayiz
	   java variable olusturmaya kizmaz ama deger atamadan kullanmaya kizar(hata verir)
	   Java local variable'lar icin "default value" atamasi yapmaz.
	 3-Instance'ler class'in heryerinde calisir. Locallar sadece method icinde calisir
	   locallar icin deger atamasi yapmaliyiz. yoksa kullanamayiz. Instance ler deger atamasi yapmadan da kullanilabilir.
	 */
	
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int a; //a variable'i mavi bolge disina cikamaz hapsedilmis
		//a++;  //hata verir java local variable'lara deger atamasi yapmaz sen yapmazsan ben yapmam der
		
		//ama
		int h=1; //deger atamasi yapinca kullanabiliriz hata vermez
		h++;

		
	}

}

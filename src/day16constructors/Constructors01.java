package day16constructors;


public class Constructors01 { //java default olarak Contructors01 constructor'ini olusturur
	
	
	/*
	constructor mutahit demektir. Java icin obje yapar.
	new yazdigimiz anda java olusturmak isteyecegimizi anlar obje olusturmak icin hazir bekler. 
	Ama nerden obje olusturur scanner class'indan constructor kullanarak obje olusturur ve scan icinde depolar
	NOTE 1=constructor'un ismi class'in ismi ile ayni olmak zorundadir.
	NOTE 2=Constructor olustururken class ismi yazildiktan sonra () parantez konulmalidir.Icinde parametre olabilir olmayadabilir
	NOTE 3= Class olusturuldugunda java bu class'tan obje olusturulacagini dusunerek "constructor" olusturur. Bu constructor'a
	"default constructor" denir
	NOTE 4= Siz kendiniz constructor urettiginizde java default constructor'i iptal eder.
	NOTE 5= Constructor ureterek bir class'tan cok farkli object'ler uretebiliriz.
	NOTE 6= constructor'larda return type yoktur. Bu yuzden constructor'lar method degillerdir. 
	        constructorlar constructor'dirlar.
	***NOTE 7= constructor'larda sadece class ismi isim olarak kullanilabilir. Fakat methodlarda isim olarak hersey kullanilabilir
	****constructor ve method arasinda 2 temel fark var bir isimlendirme digeri return type
	*/
	
	
	public Constructors01() {
		
	}
	
	
	public static void main(String[] args) {
		
		int a=4;
		System.out.println(a=+1);
		
	//  class ismi  object ismi     new keyword       constructor
    //   Scanner       scan      =     new         Scanner(System.in);
		@SuppressWarnings("unused")
		Constructors01  obj1    =      new          Constructors01();
		 
	}

}

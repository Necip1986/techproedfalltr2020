package day28inheritanceconstructorcall;

public class Runner {


	public static void main(String[] args) {


		Cat c1 = new Cat("X");
		
		//Ayni isimli variable'lardan hangisinin kullanildigina karar vermek icin
		//olusturulan object'in data type'ina bakiniz. Variable arastirmaya data type'i class'indan baslayiniz
		System.out.println(c1.a); //0
		System.out.println(c1.c);//2
		System.out.println(c1.d);//5
		System.out.println(c1.m);//1
		 
		Mammal c2 = new Cat("x");//cat constructor'ini kullanarak Mammal data tipinde object olusturuyorum
		System.out.println(c2.a);
		System.out.println(c2.c); //bu sefer c'yi mammal'dan seciyor oyuzden c 4 olur
		System.out.println(c2.m);//m'yi mammal'dan secer
		//c2 kullarak d'ye ulasamam CTE VERIR
		//System.out.println(c2.d);
		System.out.println("========");
		 Cat c3 = new Cat();
		 /*
		    Method cagrilirken ayni isimli metodlardan hangisinin kullanilacagina constructor karar verir
		    Metod'lari arastirmaya constructor ismini tasiyan class'dan baslayin ve parent'lerda arastirmaya devam edin
		  */
		 System.out.println("=========");
		 c3.mA();
		 c3.mC(); //Cat yazar cat class'indan bulup yazar
		 c3.mM(); //mammal'dan yazdirir.
		System.out.println("=====");
		Mammal c4 = new Mammal();
		c4.mA();
		c4.mC();
		c4.mM();
		
		/*
		   Data Type ve Constructor farkli class'lardan ise method arastirmaya parent olan class'tan baslayin
		 */
		System.out.println("=====");
		Mammal c5 = new Cat(); //burada hic Cat'e ugramiyor ciktilara parent'tan bakiyor.
		c5.mA();
		c5.mC();
		c5.mM();
		
		
		
		

	}

}

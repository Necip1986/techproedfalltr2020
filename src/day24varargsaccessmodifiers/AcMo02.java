package day24varargsaccessmodifiers;

import day23foreachloopdatetime.AcMo03;

public class AcMo02 {// default access modofier hicbir zaman yazilmaz

	// Java da proje kainat gibidir. yani ayridir her proje
	
	/*
	 1- Private class memberler sadece icinde bulunduklari class'larda kullanilabilirler
	    Baska class'lardan private class member'lari kullanmak mumkun degildir
	 2- Baska package'lerden object olusturursaniz, object olusturulan class'i import etmelisiniz
	 3- Baska package'lerden default class member'lara ulasamazsiniz. Ayni package'de iseniz ulasabilirsiniz
	    default ile package private es anlamlidir.
	 4- Public class member'lere herkes heryerden ulasabilir.
	 5- protected class member'lara ayni package'de iseniz ulasabilirsiniz
	    farkli package'de iseniz 2 durum var. a) child class iseniz ulasabilirsiniz
	    b)child class degilseniz ulasamazsiniz.
	 6- Class'larda da access modifier kullanilir. Ama sadece public ve default access modifier'lar kullanilabilir
	    class olustururken private veya protected kullanilmaz
	 */
	public static void main(String[] args) {
		
		AcMo01 obj1 = new AcMo01(); //obje urettim
		
		System.out.println(obj1.publicAge);
		System.out.println(obj1.protectedAge);
		System.out.println(obj1.defaultAge);
		//private yazdirilamaz baska class oldugundan
		//ayni kural method'lar icinde gecerlidir.
		
		AcMo03 obj3 = new AcMo03(); //farkli package'den kullanmak istiyorsak 
		                          //o package'den import etmeliyiz
		System.out.println(obj3.publicName);
		//public var digerleri yok. default gozukmez.
		

	}

}

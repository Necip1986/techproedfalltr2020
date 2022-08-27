package day34interface;

public interface IcDonanim {
	
	/*
	  1- Java interface'ler icindeki tum methodlarin abstract olmasi gerektigini bilir. Bu yuzden siz method olustururken 
	     abstract yazsanizda olur yazmasaniz da olur.
	     
	  2-Interface'lerdeki hersey otomatik olarak public'tir. Bu yuzden access modifier'i public olarak yazsaniz da olur yazmasaniz da olur.
	  
	  3-Normalde access modifier yazmayinca access modifier default olur ama interface'lerde access modifier her zaman public oldugundan 
	    yazmasaniz da o public'tir.
	    
	  4-Interface class degildir. Interface interface'dir.
	    
	 */
	
	/*1-***interface'deki tum variable'lar final'dir. Final variable olusturdugunuzda 
	        isimleri "bold" olarak yazilir.
	  2-public static final String marka = "Honda"; ile String marka = "Honda"; aynidir.
	  
	  3-Genel kullanim olarak "final variable" larin isimleri buyuk harflerle yazilir.
	*/
	
	int FIYAT = 20000; //variable koyu renk oldu final oldugundan
	
	public static final String MARKA = "Honda"; //hem public hem static hem de final'dir. Ama yazmaya gerek yok ustteki ile aynidir.
	
	
	
	public abstract void koltuk(); //abstract silinince CTE vermez Java zaten interface icinde concrete olmaz der otomatik abstract kabul eder
	
	public void direksiyon();// bu da abstract ama abstract yazmak sart degildir. direksiyon ve koltuk methodlarinin ikisi de abstract method'dur.
	
	void ayna(); //public' silsek te CTE vermez Java otomatik olarak public kabul eder. Bu uc kullanim da aynidir.

	
	public default void tekerlek() {
		System.out.println("ne");
	}
}

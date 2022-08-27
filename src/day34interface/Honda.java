package day34interface;

public abstract class Honda {

	/*INTERFACE MULAKATLARDA MUTLAKA SORULUR INTERFACE CLASS'I DEMEYIN CLASS DEGILDIR.
	   1-interface'lerde "concrete" method'lar kullanilamaz sadece "abstract" metodlar kullanilabilir.
	     interface'ler SADECE mecbur yapilmasi gerekenleri depolamak icin kullanilir.
	   
	   2-Java multiple inheritance'i desteklemez ama parent'lar class ise desteklemez.
	     Parent'lar interface ise java multiple inheritance'yi destekler.
	  
	   3-Birden fazla Parent class oldugunda farkli parent class'larda ayni isimli farkli body'li metodlarin olmasi mumkundur. 
	     Bu tip durumlarda child class ayni isimli farkli body'li methodlardan hangisini kullanacagina
	     karar veremez. Fakat interface'lerde method'larin body'leri olmadigindan ayni isimli metodlar birbirlerinin 
	     tamamen aynisidir. Bu method'lardan birini override etmek hepsini override etmek manasina gelir.
	   
	   NOTE: Parent interface'ler icinde ayni method signiture sahip ama return type'lari farkli method'lar varsa 
	         java interface'lar icin de CTE verir.
	   
	  
	   
	   
  */
	
	public abstract void hareket();
	
	public void diesel() {
		System.out.println("Motorin kullanir");
	}
	
	public void benzin() {
		System.out.println("Benzin kullanir");
	}
}

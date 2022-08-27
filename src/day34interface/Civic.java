package day34interface;

public class Civic extends Honda implements IcDonanim, Lastik { //interfac'ler parent olunca implement kullanilir

	//DisDonanim'i koparinca birsey degismedi cunku DisDonanima lastik uzerinden ulasabiliyorum
	/*
	   class'lari bir class'in parent'i yaparken "extends", interface'leri bir class'in parent'i yapmak icin ]
	   implements kullanilir. ve tum methodlar child class'ta override edilmeli
	 */
	int number;
	@Override
	public void hareket() {
		System.out.println("Hizli ve ekonomik hareket eder");
		
	}

	@Override
	public void koltuk() {
		System.out.println("Ortopedik koltuklari var");
		
	}

	@Override
	public void direksiyon() {
		System.out.println("Deri hidrolik direksiyon");
		
	}

	@Override
	public void ayna() { //aynayi iki kere override etmedi cunlu method'lar aynidir. ama return type farkli olunca cte verir
		System.out.println("Otomatik kararma ozelligi");
		
	}

	@Override
	public void far() {
		System.out.println("Led far");
		
	}

	@Override
	public void kaporta() {
		System.out.println("Paslanmaz celik");
		
	}

	@Override
	public void garanti() {
		System.out.println("100 bin km garanti");
		
	}

	@Override
	public void jant() {
		System.out.println("Celik jant");
		
	}

}

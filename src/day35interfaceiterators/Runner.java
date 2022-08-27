package day35interfaceiterators;

public class Runner implements Interface01 {

	public static void main(String[] args) {


		//multiply methodu static keyword ile olusturuldugundan ulasmak icin sadece 
		//interface ismi yeterlidir.
		Interface01.multiply(); //static oldugundan ulasilir
		System.out.println(Interface01.multiply());
		
		//Interface01 obj = new Interface01; //interface'den obje olusturulmaz interface'ye uzanan bir class olusturmaliyim
		
		//add methodu default keyword kullanilarak olusturuldugundan ulasmak icin mecburen object uretmelisiniz.
		//Object uretmeden ulasmaniz mumkun degildir.
		Interface01 obj = new Runner(); //data type interface01 yapilabilir ==> Runner zaten olurdu
		obj.add(); //obje olusturarak ulastim
		System.out.println(obj.add());
		
		/*
		  Concrete bir class bir interface'nin child class'i oldugunda interface'deki
		  tum absract method'lari override etmek zorundadir. Fakat bu zorunluluk "default" ve "static" keyword'lar kullanilarak olusturularak
		  olusturulan concrete methodlar icin yoktur. Burada gordugunuz gibi add() ve multiply" methodlarini override etmedik ama istersek override edebiliriz
		 */

	}

	@Override
	public int myMethod() {
		// TODO Auto-generated method stub
		return 0;
	}

}

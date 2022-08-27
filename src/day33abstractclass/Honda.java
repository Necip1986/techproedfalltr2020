package day33abstractclass;

public abstract class Honda { //abstract yazarak abstract class olusturulur.

	/*
	   1-Bazen child class'lar parent class'taki metodlarin body'lerini 
	     hep degistirerek kullanirlar. Bu tip durumlarda parent class'taki metoda
	     body koymak manasiz olur. Cunku parent class'taki method body hic kullanilmaz.
	     Bu manasizligi gidermek icin java bize body'siz metod uretme imkani verir. 
	     Body'siz metodlara "abstract metod" denir.
	     
	   2-Parent class'taki body'siz metodlari {abstract) child class'lar 
	     override etmek zorunda kalirlar. Biz bir application olustururken 
	     child class'lari parent class'taki bazi metodlari override etmek zorunda
	     birakmak istersek o metodlari abstract metod yapariz. Bu hatayi azaltir.
	   
	   3-Abstract metod olusturmak icin a) "{}" kismini yazmayin
	     b) access modifier'dan sonra abstract keyword'unu kullanin
	       
	   4-abstract metod'lar sadece abstract class'lar icinde olusturulabilir.
	
	   5-abstract class olusturmak icin access modifier'dan sonra "abstract" keyword'unu 
	     kullanin
	     
	   6-abstract keyword'u ile "{}" birarada kullanilamaz
	     
	   7-abstract class icinde hem abstract hem de abstarct olmayan (concrete=somut) 
	     metodlar kullanilabilir. 
	     
	   8-Bir concrete class abstract class'a extends ettiginde, abstract class icindeki tum abstract
	     metodlari override etmek zorundadir. Aksi takdirde CTE alir. Fakat concrete metod'lari 
	     override etmek zorunda degildir. Concrete metodlarin override edilmesi istege baglidir.
	     
	   9-Bir abstract class baska bir abstract class'a extends ettiginde herhangi bir metodu override 
	     etmek zorunda degildir. Isterse override eder isterse etmez.
	     
	   10-final class'larin child class'i olamaz. abstract class'lar child class'lara talimat vermek icin olusturulurlar.
	      Eger bir metodu final yaparsaniz o class'in child class'i olamayacagindan abstract olmasi mantikli degildir.
	      Bu yuzden java abstract class'larin final olmasina musade etmez.
	
	   11-abstract metod uretmemizin nedeni child class'larin kullanabilmesidir. Eger metodu final yaparsak
	      bu o method override edilemez demektir. Yani child class'lar kullanamaz demektir. Bu celiskiden dolayi 
	      java abstract metodlarin final olmasina musade etmez.
	
	   12-abstract metod'lar private olamazlar. Cunku abstract metodlar baska classlar tarafindan kullanilmak icin uretilir.
	      Halbuki private metodlar baska classlar tarafindan kullanilamazlar.
	 
	   13-En onemli ozellik abstarct class'lardan obje uretilemez
	 
	   14-abstract metod'lar static olamazlar. Cunku static metod'lar override edilemez. Halbuki
	      biz abstract metod'lari override etmek icin uretiriz
	 
	     !!! ABSTRACT CLASS'LARDAN OBJECT URETILEMEZ
	 */
	
	public abstract void motor(); //body'siz metod olusturduk

 
	public void deri() { //concrete method da kullanilabilir.
		System.out.println("Koltuklar deri olsun");
	}



}

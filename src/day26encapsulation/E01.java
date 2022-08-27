package day26encapsulation;

public class E01 {
	// INTERVIEW'DE SORULUR
			/*
			  1-Encapsulation kisaca "data hiding(saklamak)" demektir.
			  
			  2-Basarili bir encapsulation asagidaki ozelliklere sahip olmalidir.
			    a-Nasil kullanilacagi belli olmali. Direksiyon gibi (kolay olmali)
			    b-Kodun karmasikligi kullanimin karmasikligina sebep olmamali yani cok karmasik kodlardan
			      alusan bir yapi basit bir sekilde kullanilabilmeli
			    c-Bir bolumun bozulmasi baska bolumlerin bozulmasina sebep olmamali
			  
			  3-Encapsulation nasil yapilir?
			    a-Access modifier'lar "private" olmali
			    b-getter ve setter metodlari ile "encapsulated" data'lara ulasip onlari okuyabilir(getter ile) ve degistirebiliriz (setter ile) 
			  
			  4-Encapsulation'in faydalari:
			    a-Esneklik (Flexibility). Normalde asagidaki ornekte age variable'inin degeri 25'dir. Ancak diger class'larda 
			      setAge metodunu kullanarak age variable'inin degerini istedigimiz gibi degistirip kullanabiliriz.
			    b-reusability: Bir kere olustur tekrar tekrar kullan. Tekrar kullanilabilirlik 
			      getter ve setter metodlari bir kere olustururuz sonra proje icindeki tum class'lardan istedigimiz kadar kullanabiliriz.
			    c-getter olusturmazsam hickimse age'i okuyamaz.Banka sifresi gibi. getter olmazsa diger class'lardan okunmaz.
			      Istediginiz data'yi okunabilir istediginiz data'yi okunmaz hale getirebilirsiniz. Getter ile okunabilir yapilir okunamaz 
			      icin ise getter method olusturmazsiniz
			    d-Istediginiz data'yi degistirilebilir (setter metod olustur), istediginiz datayi degistirilemez (setter() olusturma) yapabilirsiniz
			    
			    NOT-Tum variable'lar private ve sadece getter() metod'lari olusturdum. Bu durumda tum variable'lari okuyabilirim ama degistiremem
			        Bu tarz bir class'ta data'lar sadece okunabilir degistirilemez. Bu tarz class'lara "immutable class" denir.
			    e-Kullanicinin kullandigi sistem arkasindaki karmasik yapiyi kullaniciya gostermez. Boylece kullanici yapmak istediklerini daha rahat 
			     yapar.
			     
			   5-Bir class'ta tum variable'lar private ise ve tum getter ve setter'lar olusturulmus ise bu class "fully encapsulated"
			     olarak adlandirilir.
			     
			   6-Getter ve setter metod'larina ayni zamanda "Java Beans" denir. (java taneleri)
			    
			 */
	
	          int age2 = 25; //encapsulated degil cunku private degil
	          private int age = 25; //encapsulated
	          
	          private String name="Ali";
	          	          
	          //getter() method olusturacaz : access modifier herzaman public olacak
	          
	          public int getAge() {     //age icin getter metodu olusturacagimdan variable type lar ayni olmali yani int olmali
	                                //method ismi get ile baslasin camel case 'den dolayi age'in a'si buyuk olur
	          return age;
	          }
	          
	          public String getName() { //getter boyle olusturulur
	        	  return name;
	          }
	          
	          //setter method olusturma: Access modifier public olacak
	          //return type her zaman void olacak
	          //parantez icinde her zaman parametre olmalidir.
	          
	          public void setAge(int age) { //parametre olarak age olacagindan int age olur
	        	  this.age = age;         //this bu class'taki age variable'i demektir.
	        	                          //parantez icinde her zaman parametre olmalidir.  
	          }
	          
	          public void setName(String name) {
	        	  this.name = name; //this her zaman yazilir. Bir method sadece consola yazdiriyorsa return type void olur
	        	                    //set sadece degisim yapiyor. bir action yapiyor o yuzden her zaman void olur.
	          }
	
	
	    
	          public static void main(String[] args) {
	        	  
	        	  E01 obj1 = new E01();
	        	  System.out.println(obj1.getAge());
	        	  
	        	  System.out.println(obj1.getName());
		

	        	  //static olmayan metod'lara obje uzerinden ulasabiliriz.
		
		
		
		
	}

}

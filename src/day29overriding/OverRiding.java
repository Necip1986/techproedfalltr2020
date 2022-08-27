package day29overriding;

public class OverRiding {

	/*
	   1-Parent Class'taki bir methodu child class'a gore ozellestirerek kullanmak isterseniz
	     "Overriding" yapabilirsiniz
	  
	   2-a)Overriding yaparken "method signiture'a"(name+parametre) dokunulmaz
	     b)Overriding yaparken "access modifier"lar belli kurallara gore degistirilebilir.
	     c)Overriding yaparken return type'lar belli kurallara gore degistirilebilir.
	     d)Overriding yaparken "method body" degistirilir. Zaten overriding'in amaci budur.
	       Ama method body'i degistirmeden kullanirsaniz java CTE vermez. Ama overriding'de method body'i degistirmemek mantiksizdir
	     e)Overriding yapabilmek icin parent-child relationship sarttir.
	       Yani inheritance olmadan overriding olmaz.
	     f)Override edilen method parent'taki method'dur ve java o method'a "Overridden method" denir.  
	       Child class'taki method ise "Overriding method" olarak adlandirilir.
	   
	   3-Overriding method basina "@Override" annotation'ini koyarsaniz java yaptiginiz overriding'i kontrol eder
	     herhangi bir yanlislik varsa CTE verir.
	     
	   4-Overriding method'un access modifier'i ya "Overridden Method" ile ayni olur veya daha genis olur.
	   
	   5-Return type'ler prpimitive ise "Overriding Method"un return type' overridden ile ayni olmali
	   
	   6-Return type void ise overridden method'un return type'i void ise overriding methodun'da void olmali
	
	   7-Return Type Wrapper Class ise "Overriding Method"un return type' overridden ile ayni olmali 
	
	   8-Return Type'lar arasinda parent-child relationship varsa overriding methodun return type'i ya overridden ile ayni olmali
	     veya onun child class'i olmali.
	     
	   9-Static method'lar override edilemezler. Staticler ortak kullanimdadir ondan dolayi olmaz.
	 
	  10-Final method'lar override edilemezler.
	  
	  11-Private method'lar override edilemezler.
	  
	  12-"Plymorphism" nedir? //Cok bicimlilik nedir.
	     Elcevap:Polymorphism "OverLoading" ve "Overriding" den olusur.
	     Overloading==>public void add(){}
	                   public void add(int i){}
	                   public void add(int i, String s){}
	    
	     Overriding==>public void multiply(){syso("3*4")}
	                  public void multiply(){syso("1*2*3")}
	                  public void multiply(){syso("3*4*5")}
	     ayni method farkli sekillerde kendini gosteriyor.
	     
	     ""OverLoading" ve "Overriding" arasindaki farklar nelerdir.
	     1-"OverLoading"'de method signiture (name+parametre) degistirilir.(parametre degisir.)
	        "Overriding" de method signiture (name+parametre) degismez
	     2-Overloading'de method body genellikle degistirilmez, Overriding'de method body hemen 
	       hemen her zaman degistirilir
	     3-Overloading'de inheritance gerekmez. Ayni class icinde gerceklestirilir farkli class'lar gerekmez
	       ama overriding'de inheritance sarttir.
	     4-Overloading Compile Time Polymorphism'dir.
	       Overriding  Run Time Polymorphism'dir.
	     5-Private method'lar overload edilebilirler ama override edilemezler.
	       Static method'lar overload edilebilirler ama override edilemezler.
	       Final method'lar overload edilebilirler ama override edilemezler.
	 */
}

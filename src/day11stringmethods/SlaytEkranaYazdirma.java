package day11stringmethods;

public class SlaytEkranaYazdirma {

	public static void main(String[] args) {


		String str="Cat, Caterpillar";
		     System.out.println(str.toUpperCase()); //hepsi buyuk harf olur
		     System.out.println(str.toLowerCase()); //hepsi kucuk harf olur
		     System.out.println(str.toUpperCase().toLowerCase()); //soldan saga calisir hepsi kucuk gozukur
		
		System.out.println("==========");
		
		String strA = "Cat ";
		     System.out.println(strA.trim()); //Cat
		String strB = " Cat";
		     System.out.println(strB.trim());   
		String strC = " Cat ";
		     System.out.println(strC.trim());   
		     
		System.out.println("========");
		
		String stra = "Cat";
			 System.out.println(stra.contains("a")); //true verir
				
	   // String strb = " Cat";
					 //System.out.println(contains(" ")); //false verir basinda string olmali string icinde var mi diye sorulur
	    String strc = "Cat";
	    		System.out.println(strc.contains("")); //true verir cunku ifade hicbirsey icerir
	    
	    System.out.println("===========");
	    
	    //String str="Cat, Caterpillar";
	    System.out.println(str.substring(0)); //string in tamamini yazdirir
	    System.out.println(str.substring(3)); //, Caterpillar
	    System.out.println(str.substring(4)); // Caterpillar
	    System.out.println(str.substring(15)); //r yazdirir
	    System.out.println(str.substring(16)); //hicbirsey yazdirir
	    
	    System.out.println("===========");
	    System.out.println(str.substring(5,8)); //cat yazdirir
	    System.out.println(str.substring(3,4)); //,
	    System.out.println(str.substring(5,5)); //hicbirsey yazdirir
	    //System.out.println(str.substring(8,5)); //baslangic indexi bitisten buyuk olamaz run time error verir
	    System.out.println("===========");
	    
	    System.out.println(str.startsWith("C"));// true verir
	    System.out.println(str.startsWith("c")); //false
	    System.out.println(str.startsWith("B")); //false verir
	    System.out.println(str.startsWith("Cat")); //true verir
	    System.out.println(str.startsWith("c",5)); // false kucuk harf 
	    System.out.println(str.startsWith("ter",7)); //true verir
	    System.out.println(str.startsWith("p", 11)); //false verir
	    System.out.println(str.startsWith("")); //true verir
	    System.out.println("===========");
	    
	    System.out.println(str.endsWith("r")); //true verir
	    System.out.println(str.endsWith("C")); //false verir
	    System.out.println(str.endsWith(""));  //true verir
	    System.out.println(str.endsWith(" ")); //false verir
	    System.out.println(str.endsWith("lar")); //true verir
	    System.out.println(str.endsWith("caterpillar")); //false verir
	    
	    
	    
 

	}

}

package day10Stringmethods;

public class SlaytSorular {

	public static void main(String[] args) {
		/*
		 * Aşağıdaki kodların ekran çıktısı alınırsa ne olur diye once dusunun sonra kodları yazarak
           ekran çıktılarına bakın.
		 */

		String str="Cat, caterpillar";
		
		System.out.println(str.indexOf("c")); //5
		System.out.println(str.indexOf("cat")); //5
		System.out.println(str.indexOf("s")); //-1 verir
		System.out.println(str.indexOf("CAT")); //-1 verir
		System.out.println(str.indexOf("ter")); //7 verir
		System.out.println(str.indexOf("pars")); //-1
		
		System.out.println("============");
		
		System.out.println(str.indexOf("a" , 3 )); //6 verir
		System.out.println(str.indexOf("at", 2)); //6 verir
		System.out.println(str.indexOf("at", 8));//-1
		
		System.out.println("============");
		
		System.out.println(str.lastIndexOf("a")); //14
		System.out.println(str.lastIndexOf("at")); //6 verir
		System.out.println(str.lastIndexOf("s")); //-1
		System.out.println(str.lastIndexOf("CAT")); //-1
		System.out.println(str.lastIndexOf("pars")); 
		
		System.out.println("==========");
		//String str="Cat, caterpillar";
		
		System.out.println(str.lastIndexOf("a" , 3 )); //1
		System.out.println(str.lastIndexOf("a" , 5 )); //1
		System.out.println(str.lastIndexOf("at", 2)); //1
		System.out.println(str.lastIndexOf("at", 7)); //6
		
		System.out.println("==========");
		
		String str1 = ""; 
		System.out.println(str1.isEmpty()); //true verir
		
		String str2 = " "; 
		System.out.println(str2.isEmpty()); //false verir
		
		String str3 = "Almanya"; 
		System.out.println(str3.isEmpty()); //false verir
		
	}

}

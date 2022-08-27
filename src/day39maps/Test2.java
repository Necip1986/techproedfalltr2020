package day39maps;

public class Test2 extends Test {
	
	private static int $;

	public static void main(String[] args) {
		
		//onemli bir soru
		
		String a_b;
		System.out.println("=="+$);
		

		 String name;

	        boolean init = true;

	        name = "John Fitzgerald Kennedy";

	        for (int i = 0; i < name.length(); i++) {

	            if (init)

	                System.out.print(name.charAt(i));

	            if (name.charAt(i) == ' ') {

	                init = true;

	            }else {

	                init = false;

	            }

	        }
	       
	        
//	        //1. What is the result of the following class? (Choose all that apply)
//	        		public class _C {
//	        		private static int $;
//	        		public static void main(String[] main) {
//	        		String a_b;
//	        		System.out.print($);
//	        		System.out.print(a_b);
//	        		} }
//	        		Compiler error on line 1.
//	        	    Compiler error on line 2.
//	        		C. Compiler error on line 4.
//	        		D. Compiler error on line 5.
//	        		E. Compiler error on line 6.
//	        		F. 0null
//	        		G. nullnull

	}

}

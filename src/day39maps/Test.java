package day39maps;

public class Test {

	
	 public static void main(String[] args) {
		 String s1 = "";

	        String s2 = null;

	        int length = 1;

	        try {

	            length = s1.length();

	            try {

	                length = s2.length();

	            } catch (NullPointerException e) {

	                System.out.println("Good");

	            }catch (Exception e) {

	                System.out.println("Better");

	            }

	        }finally{

	            System.out.println(length);

	        }
	        
	        int i=5;
	        while(i++>5) {
	        	System.out.println(i);
	        }
		 
	 }

}
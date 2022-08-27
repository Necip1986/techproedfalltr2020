package day31exceptions;

import java.io.IOException;

public class SlaytSoru01 {

	public static void main(String[] args)  {
		
	

		
		try {
			System.out.println("work real hard");
			throw new IllegalArgumentException();
			
		
		}catch(IllegalArgumentException e) {
			System.out.println("it ok relax");
			
		}catch(Exception e) {
			
		}


//			try {
//				return 0/0;
//			}catch(RuntimeException e) {
//				return -1;
//			}catch(ArithmeticException e) {
//				return 0;
//			}finally {
//				System.out.println("done");
//			}
//
//		}
//		
//	
	}
}

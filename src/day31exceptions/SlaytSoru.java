package day31exceptions;

public class SlaytSoru {

	public static void main(String[] args) {

     try {
    	 hop();
     }catch(Exception e) {
    	 System.out.println(e);
     }
		
		
		for(int i=0;i>3;i--) {
			System.out.println(i);
		}

		 
//		try {
//			hop();
//		}catch(Exception e) {
//			System.out.println(e.getMessage());
//		}
     
//     try {
//    	 hop();
//     }catch(Exception e) {
//    	 e.printStackTrace();
//     }
     
    }

	public static void hop() {
		throw new RuntimeException("cannot hop");
		
	}

}

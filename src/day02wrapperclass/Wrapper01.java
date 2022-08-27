package day02wrapperclass;

public class Wrapper01 {

	public static void main(String[] args) {
		
       //byte, short ve int in max ve min degerlerini kodla bulunuz.
		byte maxByte = Byte.MAX_VALUE;
		System.out.println(maxByte);
		
		byte minByte = Byte.MIN_VALUE;
		System.out.println(minByte);
		
		short maxShort = Short.MAX_VALUE;
		System.out.println(maxShort);
		short minShort = Short.MIN_VALUE;
		System.out.println(minShort);
		
		int maxInt = Integer.MAX_VALUE;
		System.out.println(maxInt);
		int minInt = Integer.MIN_VALUE;
		System.out.println(minInt);
		
		long maxLong = Long.MAX_VALUE;
		System.out.println(maxLong);
		long minLong = Long.MIN_VALUE;
		System.out.println(minLong);
		
		float maxFlo = Float.MAX_VALUE;
		System.out.println(maxFlo);
		float minFlo = Float.MIN_VALUE;
		System.out.println(minFlo);
		
		double maxDouble = Double.MAX_VALUE;
		System.out.println(maxDouble);
		double minDouble = Double.MIN_VALUE;
		System.out.println(minDouble);
		
		String name = "Ali Can"; //tum harfleri buyuk harf yapma gorevi
		name.toUpperCase(); // java tarafindan onerilen method to UpperCase
		System.out.println(name.toUpperCase());
		
		char ch=Character.MIN_VALUE;
		System.out.println(ch);
		
				 
	}

}

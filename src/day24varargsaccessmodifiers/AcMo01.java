package day24varargsaccessmodifiers;

public class AcMo01 {

	private int privateAge = 23;
	protected int protectedAge = 25;
	int defaultAge = 27; //access modifier yazilmazsa java o default demektir. //package private
	public int publicAge = 29;
	
	
	public static void main(String[] args) {
		
		AcMo01 obj1 = new AcMo01();
		System.out.println(obj1.defaultAge);
		System.out.println(obj1.privateAge);
		System.out.println(obj1.protectedAge);
		System.out.println(obj1.publicAge);

	}

}

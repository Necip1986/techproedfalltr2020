package day18staticblockarrays;

public class Test1 {

	int x=10;
	
	public static void main(String[] args) {
		//class ismi ile ulasilabilecek variable static variable'dir. 
		//Yukaridaki variable static variable degildir. asagidaki x variable'i da local variable'dir.
		//Bu yuzden syso(Test1.x) compile time error verir
		//System.out.println(Test1.x);
	}
	static {
		int x=20; //bu variable local variable'dir. static bolge disinda calismaz
		System.out.println(x+" "); 
		//static block icine hersey yazilabilir
	}

}

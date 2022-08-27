package projectvendingmachine;

import java.util.ArrayList;

public class Test {

	
	public static void main(String[] args) {
//		int arr[] = { 3, 5, 1, 2, 7, 9, 2, 3, 5, 7};
//		Verilen arrayi kullanarak asagidaki gibi bir list return eden bir method olusturun
//		[arr'nin ilk elemani, arr'nin 2. ve 3. elemanlari toplami, arr'nin 4. 5. ve 6. elemanlari toplami, 
		//arr'nin 7. 8. 9. ve 10. elemanlari toplami ... ]

		int arr[] = { 3, 5, 1, 2, 7, 9, 2, 3, 5, 7};
		
		arrReturn(arr);
		System.out.println("======");
		toplama(arr);
}
	public static void arrReturn(int arr[]) {
		
	
	 
		
	}
	
	public static void toplama(int arr[]) {
		
		ArrayList<Integer>ls = new ArrayList<>();
		int i=0;
		
		while(i<arr.length) {
		    int bas=i*(i+1)/2;
	    	int bitis=(i+1)*(i+2)/2;
	    	if(bitis>arr.length) {
	    		break;
	    	}
		
	    	int sum=0;
		
		    for(; bas<bitis; bas++) {
			     sum=sum+arr[bas];     
		    }
		    ls.add(sum);
		   i++;
		}
		System.out.println(ls);
	}
}

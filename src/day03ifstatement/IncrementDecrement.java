package day03ifstatement;

public class IncrementDecrement {

	public static void main(String[] args) {
		/*
		 Increment bir variable in degerini toplama veya carpma kullanarak artirmaya denir.
		 */
		
		int i1 = 12;
		System.out.println(i1); //12
		
		//1. yol
		i1 = i1 + 5;
		System.out.println(i1); //17
		
		// i1 in degerini 8 artirin
		i1 = i1 + 8;
		System.out.println(i1); //25   i1+=8 ile i1 = i1 + 8 ayni anlamdadir.
		
		//2. yol += arasinda bosluk olmaz. bu yontem tercih edilir.recommended
		i1+=10;
		System.out.println(i1);
		i1 += 5;
		System.out.println(i1); //40 
		
		//3.yol: bu yol sadece 1 artirmak istenildiginde kullanilir.
		i1++;
		System.out.println(i1);
		
		int i2 = 3; //1. yol
		System.out.println(i2);
		i2 = i2*4;
		System.out.println(i2);
		
		i2*=2; //2. yol
		System.out.println(i2);
		
		//carpmada ucuncu yol yoktur. carpmada 2 yol vardir.
		
		/*
		 Decrement: bir variable nin degerini cikarma ve bolme yaparak azaltmak demektir.
		 */
		
		int k = 12;  //1. yol
		System.out.println(k);
		//k nin degerini 3 azaltin
		k = k - 3;
		System.out.println(k); //9
		
		//2. yol ile 5 azaltin
		k-=5;
		System.out.println(k); //4
		
		// 3. yol ile 1 azaltin
		k--;
		System.out.println(k); //3
		
		//bolme
		int m = 12;
		System.out.println(m);
		//1. yolla yarisina indirin
		m = m / 2;
		System.out.println(m);
		
		//2. yol ile tekrar yarisina
		m /= 2;
		System.out.println(m); //3
		
		
		

	}

}

package day14whiledowhileloop;

public class DoWhile01 {

	public static void main(String[] args) {
		
	
		int i=1;
		while(i<1) {
			System.out.println("While Loop"); //calismadigi icin ekrana bir sey yazmaz. en basta condition calismadi 1<1 false
			i++;
		}

		int k=1;
		do { //do yap demek java ya yap diyoruz
			System.out.println("Do-While Loop");  //yukardaki ile ayni olmasina ragmen calisti do While ile. Do While ile while farkidir bu
			k++; //===>k=2 oldu
		}while(k<1); //ilk kontrolde 2<1 oluyor loop kiriliyor ve artik calismiyor. Ama yazdigimiz kod bir kere calisti.
	}

	/*
	 * NOT: While Loop ile do While farki
	 * 1= While kullanirsaniz java once sarti kontrol eder sonra loop body si icindeki kodu calistirir.
	 *    do While loop kullanirsaniz Java once Loop body icindeki kodu calistirir sonra sarti kontrol eder.
	 * 2= While loop kullanirsaniz loop body icindeki kod bazen hic calismayabilir
	 *    fakat d while icindeki kod en az bir kere calisir
	 *    
	 *    NOT: do While loop oyun programi yazmak icin iyidir.
	 */
}

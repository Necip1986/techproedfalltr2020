package day14whiledowhileloop;

public class Whileloop02 {

	public static void main(String[] args) {
		/*
		 * 3 basamakli 4 ve 6 ya tam bolunebilen tamsayilari buyukten kucuge ekrana yaziniz
		 * bu sayilarin kac tane oldugunuda ekrana yazdiriniz
		 */

	    int i=999;
	    
	    int counter=0;   //buna flag denir (isaret bayragi koymak)
	    
	    while(i>=100) {
	    	if(i%4==0 && i%6==0) {
	    		System.out.print(i+" ");
	    		counter++;  //sistemin kac kere calistigini goruyoruz
	    	}
	    	i--;
	    }
	 
	    System.out.println();
	    System.out.println("4 ve 6'ya bolunen 3 basamakli "+counter+" tane sayi var");
	}

}

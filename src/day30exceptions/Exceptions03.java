package day30exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions03 {

	public static void main(String[] args) throws FileNotFoundException {

		FileInputStream fis = null;
//ikinci tavsiyeyi seciyorum. dosyanin oldugu constructor'da CTE'yi gidermek icin
		try { //java'ya bu kodu calistirmayi dene diyorum. Java denerim problem olursa uyaririm der.
			
			fis = new FileInputStream("src/day30exceptions/TextFileTr");
		
			int k;
			while((k=fis.read())!=-1) {
				System.out.print((char)k);
			}
			
			
		} catch (FileNotFoundException e) {//catch yakala demek java ya bu kodu calistir eger problem olursa onu yakalarim diyorum 
			                               //ne ile yakalarim FileNotFoundException class'i ile 
			                               //e yerine baska harflerde yazilir ama java e'yi kullaniyor.
			System.out.println("Ya path yanlis veya dosya silinmis.");
	
		} catch (IOException e) {
			
			System.out.println("Dosya okurken problem olustu");
	
		}finally {
			try {
				fis.close(); 
				System.out.println("kapandi");
			}catch (IOException e) {
				System.out.println("Kapanmadi");
			}
			//cloud'da is yaptiktan sonra o isi yaptiktan sonra fazla para vermemek icin dosyayi kapatmaliyim
			//bu local try icinde kullanilmis ondan hata veriyor try icinden cikarinca artik kizmaz
		}

		
		//Tr'nin r'si silinince benim mesajim gozukur. bir onceki class'ta teknik mesaj vardi burda mesaj daha anlasilir.
		//Hangisini kullanmak iyidir. Bu daha iyidir. Istedigimizi yazabilir. Genellikle try-catch kullanilir. verilen mesajlar 
		//daha anlasilirdir. 

		
		//finally block exception olsa da olmasa da calisir. Cloud ile calisirken baglanti mi kesmek icin kullanirim
		
	}

}

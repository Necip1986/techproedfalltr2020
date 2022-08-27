package day30exceptions;

import java.io.FileInputStream; //ilk defa io kutuphanesini kullaniyoruz input-output=io
import java.io.FileNotFoundException;
import java.io.IOException;
                                //bu class'ta parametresiz constructor yok parametre yazmaliyiz
public class Exceptions02 {

	//FileInputStream==dosyaya girdi akisi. Bu bir class'tir.
	public static void main(String[] args) throws FileNotFoundException, IOException { //java ya dedik ki dosya yanlissa bana haber ver dosya yerinde yoksa bana haber ver
                                           //java bunu kullanir. Bu bir class'tir. Bunun ne zaman kullanilacagini bulmak lazim.
		//Dosyaya ulasmak                 //bir dosyaya ulasmak istedigimizde kullanilir. path silinmis veya dosya silinmis ise bu class calisir. Dosyaya ulasma problemlerinde kullanilir.
		FileInputStream fis = new FileInputStream("src/day30exceptions/TextFileTr");  //bu constructor parametresiz kullanilmaz. Dosyaya calisir dosya ismi vermeliyiz 
                                                                                      //java korkuyor ya adres yanlissa diye CTE veriyor. Dosya da silinmis olabilir.
		//Ulasilan dosya uzerinde islem yapmak, ornegin okumak.
		
		int k;
		while((k=fis.read())!=-1) { //yukarda throws IOException cikti diger duzeltme yi kaldirdi bu onun isinide yapiyor.
			System.out.print((char )k);
		}
		//read metodu dosyaya gidiyor adresten dosyaya gidiyor. dosyanin icine giriyor ve ilk karakteri aliyor (j'yi) ilk
		//karakteri k'ya yapiyor. Ama j'yi degil degerini yani 80';ini atiyor. 80!=1- oldugundan 80'i char'a ceviriyor ve ekrana j yaziyor. 
		//sonra read diger karakteri aliyor (a'yi aliyor 97 yani) 97!=-1 oldugundan 97'yi char'a ceviriyor a oluyor. Dosyadaki herbir karakter birer birer harfe cevriliyor. En sonda
		//karakter bitince -1 gorur -1=1- oldugundan loop kiriliyor.
		
		//simdi java'yi endiselerinde hakli cikaralim
		//Dosyanin adinda Tr'nin r'si silinince FileNotFoundException hatasi verir dosya yerine yok der java 
		//r'yi tekrar yerine yazinca duzelir.
		
		fis.close();
		
		

	}

}

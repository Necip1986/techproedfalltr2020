package day18staticblockarrays;

import java.util.Arrays;

public class Arrays01 {

	int x=12;
	
	/* 1- Array'ler birden fazla degeri depolamak icin kullanilabilir.
	   2- Array'lere konulan degerlerin data type'leri ayni olmalidir.
	   3- Array olustururken mutlaka kac eleman yerlestirecegimizi belirtmemiz gerekir
	   4 Array'lerde a)primitive ve b)reference'ler depolanabilir  non-primitive'ler konamaz string depolanamaz
	   (reference non primitive'lerin adresleri demektir)
	 */
	public static void main(String[] args) {
		//Array olusturmak
		int a[] = new int[4]; //benim array int olacak ve 4 tane olacak demis oluyoruz
		//Array i consola yazdirmak
		System.out.println(Arrays.toString(a)); //[0, 0, 0, 0] index kullaniyoruz
		
		//Array'e eleman eklemek
		a[0]=8; //a array inde ilk elemana 8 ekledim
		System.out.println(Arrays.toString(a));
		a[2]=15;
		System.out.println(Arrays.toString(a));
		
		a[3]=8;
		System.out.println(Arrays.toString(a)); //son eleman 8 artirildi
		a[1]=23;
		System.out.println(Arrays.toString(a));
		
		//Array'de kac eleman oldugunu bulmak
		System.out.println(a.length); //Array'lerdeki lenght lerde parantez kullanilmaz
		//not;stringlerde kullandiginiz lenght(), arraylerde ise lenght

		//string array olusturunuz
		String b[]=new String[3];
		System.out.println(Arrays.toString(b)); //olmaz demistik ama java array'e string koymuyor referenceyi koyuyor yani string adresini 
		                                       //koyuyor.
		b[0]="Ali";
		System.out.println(Arrays.toString(b)); //[Ali, null, null] yazar adrese gidip aliyi getirdi.
		b[1]="Ayse";
		System.out.println(Arrays.toString(b));
		b[2]="Kemal";
		System.out.println(Arrays.toString(b));
		
		System.out.println(b.length); //kac tane string tanimlanmis
		
		//Bir array'den spesific bir elemani yazdirmak
		System.out.println(b[2]); //sadece kemal'i yazar
		System.out.println(b[0]);//ilk elemani yazar
		System.out.println(b[1]); //ayse yazar
		
		//b array'indeki elemanlari alt alta consola yazdiriniz. for loop kullanarak yapabiliyoruz
		//Array'deki elemanlari birer birer ekrana yazdirmak for loop ile olur
		
		for (int i = 0; i< b.length; i++) {
			System.out.println(b[i]);
		}
		//a array'indeki elemanlari ayni satira onlerine yildiz koyarak tersten yazdiriniz
			for (int j = a.length-1; j >= 0; j--) {
				System.out.print("*"+a[j]);
			}	
		//a array'inde indexi cift olanlari yazdiriniz
				System.out.println("==");
				for (int j2 = 0; j2 < a.length; j2++) {
					if(j2%2==0) {
						System.out.println(a[j2]);
					}	
		}
		
		//Array'deki elemanlari kucukten buyuge (ascending order) siralamak
		Arrays.sort(a); //bu array'deki elemanlar kucukten buyuge dogru siralandi [8,8,15,23]
	    System.out.println(Arrays.toString(a));
				
				//sort methodunu b array'i icin kullaniniz.String Array'lerde sort() metodu alfabetik siralama yapar
				//Java da kucukten buyuge siralama ve alfabetik siralama yerine "Natural Order" KULLANILIR.
		Arrays.sort(b);
		System.out.println(Arrays.toString(b));//stringlerde kullanilinca alfabetik siralama yapar
				
		//
	}

}

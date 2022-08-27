package day40lambda;

import java.math.BigInteger;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Lambda08 {

	public static void main(String[] args) {
		
		System.out.println(sum1(20));
		System.out.println(sum2(20));
		System.out.println(sum3(20));
		System.out.println(sumCift(20));
		System.out.println(sumIlkxCift1(20));
		System.out.println(sumIlkxCift2(20));
		System.out.println(sumIlkTekx1(20));
		System.out.println(sumIlkTekx2(20));
		kuvvet2Yazdir(5);
		System.out.println();
		istenenSayininKuvvetYazdir(3,6);
		System.out.println();
		System.out.println(istenenSayininIstenenKuvveti(2, 3));
		System.out.println(faktoriyelHesapla1(3));
		System.out.println(faktoriyelHesapla2(5));
		System.out.println(factorialBigInteger(50));
		

	}
	//1'den 10'a kadar tamsayilari toplayan bir program yaziniz
	//structured Programming
	public static int sum1(int x) {
		int sum=0;
		for(int i=1; i<=x; i++) {
			sum+=i;
		}
		return sum;
	}
	//Functional Programming
	//IntStream metodunu kullanicam
	
	public static int sum2(int x) {
		return IntStream.range(1, x+1).sum(); //subString mantigi son sayi dahil degil ilki dahil
	}
	
	public static int sum3(int x) {
		return IntStream.rangeClosed(1, x).sum();//burda x dahil
	}
	//1'den 10'a kadar cift tamsayilari toplayan bir program yaziniz
	public static int sumCift(int x) {
		return IntStream.                 //intStream kullaninca sanki elimizde collection varmis gibi islem yapar
				rangeClosed(1, x).
				filter(t->t%2==0).
				sum();
	}
	//ilk x pozitif cift tamsayiyi toplayan bir program yaziniz
	//1.yol
	public static int sumIlkxCift1(int x) {
		return IntStream.rangeClosed(1, 2*x).filter(t->t%2==0).sum();
	}
	//2.yol
	public static int sumIlkxCift2(int x) {
		return IntStream.iterate(2, t->t+2).limit(x).sum(); //seed yazan yere baslangic degerini yaziyoruz
	}
	//ilk x pozitif tek sayiyi toplayan programi yaziniz
	public static int sumIlkTekx1(int x) {
		return IntStream.rangeClosed(1, 2*x-1).filter(t->t%2!=0).sum();
	}
	//recommended
	public static int sumIlkTekx2(int x) {
		return IntStream.iterate(1, t->t+2).limit(x).sum();
	}
	
	//2'nin ilk 5 kuvvetini ekrana yazdiran programi yaziniz==>2 4 8 16 32
	public static void kuvvet2Yazdir(int x) {
		IntStream.iterate(2, t->t*2).limit(x).forEach(Lambda01::printEl);
	}
	
	//Istenilen sayinin 
	public static void istenenSayininKuvvetYazdir(int a, int x) {
		IntStream.iterate(a, t->t*a).limit(x).forEach(Lambda01::printEl);
	}
	
	//Istenilen bir sayinin istenilen kuvvetini ekrana yazdiran programi yaziniz
	public static int istenenSayininIstenenKuvveti(int a, int x) {
		return IntStream.iterate(a, t->t*a).limit(x).reduce(0,(m,n)->n);
	}
	
	//istenilen bir sayinin faktoriyelini hesaplayan programi yaziniz
	public static int faktoriyelHesapla1(int x) {
		return IntStream.rangeClosed(1, x).reduce(1,(m,n)->m*n);
	}
	public static OptionalInt faktoriyelHesapla2(int x) {
		return IntStream.rangeClosed(1, x).reduce(Math::multiplyExact);
	}
	
	//buyuk sayilarla calisabilmek
	public static BigInteger factorialBigInteger(int x) {
		return IntStream.rangeClosed(1, x).mapToObj(BigInteger::valueOf).reduce(BigInteger.ONE,BigInteger::multiply);
	}
	
	
 
}

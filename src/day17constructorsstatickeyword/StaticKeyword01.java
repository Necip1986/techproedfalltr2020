package day17constructorsstatickeyword;

public class StaticKeyword01 {
	
	/*
	 Class'in icinde metotlarin disinda olusturulan variable'lara "instance variable" denir.
	 Class'in icinde metotlarin disinda olusturulan static variable'lara "class variable" denir.
	 NOTE:Instance variable'ler gibi class variable'lar icin de default degerler vardir
	 */
	 //instance variable'lar objenin malidir. bunlar objelere yapistirilir. her obje icin uretilir. instance olmak objeye ait olmak demektir.(kafa gibi)
	 //k variable'i class'a yapisir, monte edilir class'in malidir. class icinde 1 kere uretilir. obje uretince uretilmez
	              //static variable'i butun objeler kullanabilir. ortak maldir. (ay, gunes)
	              //k daki degisim butun objeleri etkiler 

	//static olanlara ulasmak icin obje olusturmaya gerek yoktur. Direkt class icinden static olanlara ulasilabilir.
	//class'in icinden instance variable'a ulasamayiz obje olusturmaliyiz. 
	//Instance olanlara ulasmak icin obje olusturmak zorundayiz. Obje olusturmadan instance variable'a ulasilamaz.
	
	//Static olanlara obje uzerinden de ulasilabilir. Ama mantikli degil.
	//eger static olanlara obje uzerinden ulasirsaniz Java sizi sari alt cizgi ile uyarir.
	
	/*
	 NOT: Static(class) variable'lara ulasmak icin object olusturmaya gerek yoktur, sadece class ismi kullanilarak ulasilabilir
	 Instance(object) variable'lara ulasabilmek icin object olusturmak zorundayiz.
	 */
	int i; 
	static int k;
	String name="Ali";
	static String gender="Erkek";
	
	public static void main(String[] args) {


		

	}

}

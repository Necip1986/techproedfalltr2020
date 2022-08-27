package day17constructorsstatickeyword;

public class Insan1 {
	int age;
	String name;
	int height;
	boolean isHonest;
	String job;
	String gender;
	static int k;
	/*
	 1-Constructor icinden baska bir constructor cagirmak icin "this()" kullanirsaniz mutlaka ilk satira yazmalisiniz
	 Aksi takdirde CTE alirsiniz. constructor cagrisi basta yapilmali.
	 2-Bir constructor icinden sadece bir tane constructor cagrisi yapabilirsiniz.cunku 2 tane cagri yaparsaniz birisi ilk
	 satirda olmayacaktir, buda ilk kuralla celisir
	 
	 */
	public Insan1(){ //parametresiz constructor
		this("Nurse", "Erkek");  //this()  olmaz ; den sonra satir bitmistir.
		//this(); ikinci cagri yapilamaz ilk satirda olmadigi icin
		System.out.println("Parametresiz");
		
	}
	
	public Insan1(String name) {
		this(); //this demek bu demek parantez ise constructor demek yani bu constructor'i cagir demek.
		System.out.println("Name parametreli");
		
	}
	
	public Insan1(String job, String gender) {
		System.out.println("Job ve gender parametreli");
		
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Insan1 i1=new Insan1("Ahmet");
	}


}

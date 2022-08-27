package day17constructorsstatickeyword;

public class Insan {

	int age=12;
	String name="ALI";
	int height;
	boolean isHonest;
	String job;
	String gender;
	
	
	
	public Insan(){ //parametresiz constructor
		System.out.println("Parametresiz");
	}
	
	public Insan(String name) {
		this (); //this demek "bu" demek parantez ise "constructor" demek yani bu constructor'i cagir demek.
		System.out.println("Name parametreli");
		
	}
	
	public Insan(String job, String gender) {
		this("Veli");
		System.out.println("Job ve gender parametreli");
		
	}
	public Insan(int age, int height) {
		this("Veli","Emine");
		System.out.println("age and height parametreli");
	}
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Insan i4=new Insan();
		System.out.println(i4.name);
		System.out.println("====");
		Insan i1=new Insan("Ali");
		System.out.println("======");
		Insan i2=new Insan("Doktor", "Bayan"); //ilk olarak parametresiz 2.name parametreli 3.ise job ve gender parametreli yazdirir
		System.out.println("====");
		Insan i3=new Insan("Ahmet");
		System.out.println("========");
		Insan i5=new Insan(2,6);
	}

}

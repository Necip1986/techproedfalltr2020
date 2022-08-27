package day29overriding;

public class Cat extends Animal {

	@Override //Annotatipn denir buna. bunu yazarsak java bize yardim eder. benim overridingimi kontrol eder
	          //eger bu annotation olmazssa java mudahale etmez ses1 yapsam java farkli bir method olarak kabul eder
	public void ses() { //overriding method
		System.out.println("Kediler miyavlar");
	}

	@Override
	 public int add() { //animal class'ta default iken access modifier olmayi kabul eder.
		return 1+2;       //animal class default iken protected'ta kabul eder
	}                     //default ta kabul eder
	                      //private' kabul etmedi
	                      //yani private haric hepsi kabul
	//animal class'ta access modifier protected olursa;
	//public ve protected kabul edildi
	//private ve default kabul edilmedi
	//baba genis olcam diyorsa cocuk daraltamaz kisitlayamaz.

	@Override
	public int multiply() {
		return 1*2;
	
		//int iken short kabul etmedi, long da kabul etmedi
		//primitive'lerde return type ayni olmalidir.
		
		//return type void ise degismez void olmali
	}

	@Override
	public Integer multiple() {
		return 1*2;
	}
	//Wrapper class olunca da farkli kabul etmiyor. short ve Long olmadi

	@Override
	public Animal create() { 
		return new Cat(); //Cat yazmak mumkun cunku Cat bir Animal'dir
	
		//Animal yerine Cat yazinca kabul eder. Cat Animal'in cocugu oldugundan kabul eder.
	}
	
	//@Override //zaten java source'a koymamisti
	public static void eat() {
		System.out.println("Kediler sut icer");
		
		//@Override yazinca sikayet eder. static method'lar Override edilemezler
	}
	
	/*
	@Override
	public final void eaty() {
		System.out.println("Kediler sut icer");
		*/
}


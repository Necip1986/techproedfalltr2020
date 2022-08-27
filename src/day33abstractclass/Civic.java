package day33abstractclass;

public class Civic extends Honda { //source'den override ekleyince cte kalkti

	@Override
	public void motor() {
		System.out.println("1.6 Eco");
		
	} //extends yapinca CTE verir. parent abstract ise child'da abstract olunca sorun cozulebilir.

	//abstract yakit metodu olusturalim
	
	//public abstract void yakit();  bu olusturulmaz cunku civic abstract degil
	
}

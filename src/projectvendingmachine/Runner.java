package projectvendingmachine;

public class Runner {

	public static void main(String[] args) {
		
		System.out.println("Merhaba Alisverise Hos geldiniz");
		
		//metod static olmadigindan obje olusturuyorum
		
		Products product = new Products();
		//System.out.println(product.toString()); bunu calistirmaya gerek kalmadi select metodu onun isini yapar
		
		Methods methods = new Methods();
		double money = methods.money();
		System.out.println("Hesabinizda "+money+" dollar var");
		product.setPrice(methods.select(product));
		money = methods.balance(product.getPrice(), money, product);
		methods.purchase(product.getPrice(), money, product);

	}

}

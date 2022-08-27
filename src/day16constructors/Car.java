package day16constructors;

public class Car {
	
	int price; //5000
	int year; //2018 model
	String make;//toyota
	String model;
	String color;
	boolean isDiesel;//true
	double km;
	
	
	public Car(int price, int year, String make, boolean isDiesel) { //constructor olusturdum.
		//this bu class'in icinden demektir. "." koyunca alternatifler cikar
		//sol tarafa yazilan sey instance variable'dir. esittirin sag tarafina yazilan parametredir.
		
		this.price = price;  
		
		this.year = year;
		
		this.make = make;
		
		this.isDiesel = isDiesel;
	}
		public Car(int price,int year,String make,boolean isDiesel, String model,String color,double km) {
			this.price = price;  
			this.year = year;
			this.make = make;
			this.model = model;
			this.color = color;
			this.isDiesel = isDiesel;
			this.km = km;
		}
		
	

	public static void main(String[] args) {
		
		Car car1 = new Car(5000, 2018, "Toyota", true);  //sikayet eder cunku 4 tane parametre var onun icin parametreleri yazmaliyim parantez icine

		System.out.println(car1.price); //price'i yazdirdik 5000
		System.out.println(car1.year); //2018
		System.out.println(car1.make); //Toyota
		System.out.println(car1.isDiesel); //true
		
		Car car2 = new Car(80000, 2020, "Audi", false);  //sikayet eder cunku 4 tane parametre var onun icin parametreleri yazmaliyim parantez icine

		System.out.println(car2.price); //80000
		System.out.println(car2.year); //2020
		System.out.println(car2.make); //Audi
		System.out.println(car2.isDiesel); //False
		
		//ayni kalibi kullanarak farkli objeler uretildi.
		System.out.println("======");
		Car car3 = new Car(30000, 2017, "BMW", false, "3.35i", "Red", 50000);
		System.out.println(car3.price); 
		System.out.println(car3.year); 
		System.out.println(car3.make); 
		System.out.println(car3.isDiesel); 
		System.out.println(car3.model);
		System.out.println(car3.color);
		System.out.println(car3.km);
		
		System.out.println("=======================================");
		Animal a=new Animal();
		System.out.println(a);
		
		
	}

}

package day35interfaceiterators;

public interface Interface01 {

	public abstract int myMethod() ;
	
	/*
	   Method olusturuken "default" veya "static" keyword'larini kullanarak
	   isterseniz interface icinde "concrete method" olusturabilirsiniz
	   
	   NOTE:  Interface icinde concrete method olusturmak icin kullanilan "default keyword'u" access modifier
	   degildir. Asagidaki method'da gordugunuz gibi access modifier public'tir.
	  
	   NOTE: Interface'lerde "default" keyword'unu kullanarak olusturulan method'lara "default method" denir.
	 
	 */
	//concrete olusturmanin 1. yolu
	//Asagida gordugunuz gibi interface icinde concrete method olusturmanin iki yolu var 1. default keyword'unu kullanmak 2.static keyword'unu kullanmak
	//default keyword'unu kullanirsaniz baska class'lardan bu methoda ulasmak icin object olusturmalisiniz
	//static keyword'unu kullanirsaniz baska class'lardan bu methoda ulasmak icin object olusturmaya gerek yok sadece interface ismi kullanilarak ulasilir.
	public default int add() { //default'u access modifier zannetmeyin bunun access modifier'i public'tir. 
		return 2;
	}
	
	//concrete method olusturmanin 2. yolu
	public static int multiply() {
		return 12;
	}
}

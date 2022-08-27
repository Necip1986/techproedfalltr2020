package day26encapsulation;

public class E03 {
	
	private int num = 12;
	private String name = "Emine";
	private char initial = 'J';  //initial ilk harf demek
	private boolean old = true;
	
	//source sekmesinden generate getter ve setter secilir insertion point son member olmali 
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getInitial() {
		return initial;
	}
	public void setInitial(char initial) {
		this.initial = initial;
	}
	//date type boolean oldugunda getter() methodun ismi get ile degil is ile baslar get ile de kod calisir. ama java'nin gramer kuralina uymaz.
	//set metod'larda istisna yok aynidir.
	public boolean isOld() { // is mi takisidir. yasli mi
		return old;
	}
	public void setOld(boolean old) {
		this.old = old;
	}
	

	
}

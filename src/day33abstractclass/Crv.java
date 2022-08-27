package day33abstractclass;

public class Crv extends Honda{ //parent'te abstract metod oldugundan burda override etmem sart yoksa hata veriri

	@Override
	public void motor() {
		System.out.println("2.5 Super Turbo 4x4");
		
	}

	@Override
	public void deri() {
		System.out.println("Koltuklar suni deri");
	}

}

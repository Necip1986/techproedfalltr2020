package day26encapsulation;

public class Test {
	
	public double channelTuning(int channel) {

		switch (channel) {

		case 1:

			return 34.56;

		case 2:

			return 54.89;

		case 3:

			return 73.89;

		case 4:

			return 94.98;

		}

		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ONEMLI
		int y = 1;
		System.out.println(y++ + "");
		System.out.println(y);
		
		//onemli
		int x=0;
		System.out.println(x++);
		System.out.println(x);
		while(x++<10) {
			System.out.print(x);
			String message=x>10?"Greater than":"me";
			System.out.print(message+ x+" ");
		}

	}

}

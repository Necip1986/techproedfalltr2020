package day20multidimensionalarraysarraylists;

public class Test {

	public static void main(String[] args) {

		//output nedir
		
		int[][] x = {{2, 1}, {5, 7, 6}};

		System.out.println(m(x));
	}
	
	public static int m(int[][] m) {

		int result = m[0][1];

		for (int i = 0; i < m.length; i++) {

			for (int j = 0; j < m[i].length; j++) {

				if (result < m[i][j]) {

					result = m[i][j];
				}
			}
		}		

		return result;
	}
}

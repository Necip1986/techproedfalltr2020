package day31exceptions;

import javax.management.RuntimeErrorException;

public class SlaytOutputSoru {

	public static void main(String[] args) {


		String s="";
		try {
			s+="t";
		}
		catch(Exception e) {
			s+="c";
		}finally {
			s+="f";
		}
		s+="a";
		System.out.println(s);
		
		System.out.println(exceptions());

	}

	public static String exceptions() {
		
		String result = "";
		String v = null;
		try {
			try {
				result+="before ";
				v.length();
				result+="after";
			}catch(NullPointerException e) {
				result+="catch ";
				throw new RuntimeException();
			}finally {
				result+="finally ";
				throw new Exception();
			}
		}catch(Exception e) {
			result+="done";
		}
	
		return result;
	}

}

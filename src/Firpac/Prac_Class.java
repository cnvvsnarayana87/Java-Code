// Generating 4-digit random number
package Firpac;

public class Prac_Class {

	public static void rNum() {
		double ran = Math.random();
		int rand = (int) (ran * 10000);
		String srand = String.valueOf(rand);
		int size = srand.length();
		if(size == 4) {
			System.out.println(srand);
		}else {
			rNum();
		}
	}
	public static void main(String[] args) {
		rNum();
	}
}



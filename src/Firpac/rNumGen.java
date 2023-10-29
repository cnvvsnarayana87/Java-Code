// Generating 4-digit random number without using Math.random method
package firpac;

import java.time.Instant;

public class rNumGen {

	public static void rNum() throws InterruptedException {

		Instant num = java.time.Clock.systemUTC().instant();
		Thread.sleep(50);
		int nanoNum = num.getNano();
		int intNum = (nanoNum % 1000000) / 100 ;
		String str = Integer.toString(intNum);
		int lStr = str.length();
		if (lStr == 4) {
			System.out.println(intNum);
		} else {
			rNum();
		}
	}
	public static void main(String[] args) throws InterruptedException  {
		for (int i = 1; i <= 10; i++) {
			rNum();
		}
	}	
}


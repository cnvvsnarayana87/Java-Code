// Generating 4-digit random number without using Math.random method

package firpac;

import java.time.Instant;

public class GenerateRandomNumber {

	public static void generateRandomNumber() throws InterruptedException {

		Instant currentTime = java.time.Clock.systemUTC().instant();
		Thread.sleep(50);
		int nanoSeconds = currentTime.getNano();
		int randomValue = (nanoSeconds % 1000000) / 100;
		String randomValueString = Integer.toString(randomValue);
		int stringLength = randomValueString.length();
		if (stringLength == 4) {
			System.out.println(randomValue);
		} else {
			generateRandomNumber();
		}
	}

	public static void main(String[] args) throws InterruptedException {
		for (int i = 1; i <= 10; i++) {
			generateRandomNumber();
		}
	}
}

// Generating 4-digit random number
package firpac;

public class RandomNumber {

    public static String generateRandomNumber() {
        double number = Math.random();
        int randomNumber = (int) (number * 10000);
        String numberString = String.valueOf(randomNumber);
        int size = numberString.length();
        if (size == 4) {
            return numberString;
        } else {
            return generateRandomNumber();
        }
    }

    public static void main(String[] args) {
        RandomNumber randomNumberGenerator = new RandomNumber();
        String randomNum = randomNumberGenerator.generateRandomNumber();
        System.out.println("Random 4-digit number: " + randomNum);
    }
}


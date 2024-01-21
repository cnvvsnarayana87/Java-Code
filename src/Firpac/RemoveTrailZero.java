package firpac;

public class RemoveTrailZero {

	public static void main(String[] args) {
		String inputNumber = "51230100";
		System.out.println("String without trailing zeros : " + removeTrailingZeros(inputNumber));
	}

	public static String removeTrailingZeros(String number) {
		return number.replaceAll("0*$", "");
	}
}

package firpac;

public class ZigZagPrint {

	public static void main(String[] args) {
		String inputString = "*";
		int charForRow = 6;
		int numberOfRows = 6;
		for(int i = 1; i <= numberOfRows; i++) {
			for(int j = 1; j <= charForRow; j++) {
				System.out.print(inputString+" ");	
			}
			System.out.println();
		}
	}
}


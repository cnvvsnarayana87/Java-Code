package firpac;

public class ColumnNumber {

	public static void main(String[] args) {
		String columnTitle = "ZY";
		int columnNumber = 0;
		for (int i = 0; i < columnTitle.length(); i++) {
			int alphabetNumber = columnTitle.charAt(i) - ('A' - 1);
			columnNumber = (columnNumber * 26) + alphabetNumber;
		}
		System.out.println("Column Number for Corresponding Column Title : " + columnNumber);
	}
}

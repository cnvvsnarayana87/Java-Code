package firpac;

import java.util.ArrayList;
import java.util.List;

public class ColumnTable {

	public static void main(String[] args) {
		int columnNumber = 701;
		List<Integer> columnTitleNumber = identifyColumnTitleNumber(columnNumber);
		String columnTitle = identifyColumnTitle(columnTitleNumber);
		System.out.println("Excel Sheet Column Title : " + columnTitle);
	}

	public static List<Integer> identifyColumnTitleNumber(int columnNumber) {
		List<Integer> columnTitleNumber = new ArrayList<>();
		int res = columnNumber % 26;
		if (res == 0) {
			res = 26;
		}
		columnTitleNumber.add(res);
		int column = (columnNumber - res) / 26;
		if (column > 0) {
			columnTitleNumber.addAll(identifyColumnTitleNumber(column));
		}
		return columnTitleNumber;
	}

	public static String identifyColumnTitle(List<Integer> result) {
		StringBuilder columnTitle = new StringBuilder();
		for (int i = result.size() - 1; i >= 0; i--) {
			columnTitle.appendCodePoint(64 + result.get(i));
		}
		return columnTitle.toString();
	}
}

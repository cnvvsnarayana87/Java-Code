package firpac;

import java.util.ArrayList;
import java.util.List;

public class IndicesOfPeaks {

	public static void main(String[] args) {
		int[] mountain = { 1, 4, 3, 8, 5 };
		List<Integer> indicesOfPeaks = new ArrayList<>();
		for (int i = 1; i <= mountain.length - 2; i++) {
			if (mountain[i] > mountain[i - 1] && mountain[i] > mountain[i + 1]) {
				indicesOfPeaks.add(i);
			}
		}
		System.out.println("Indices of elements greater than their neighboring elements : " + indicesOfPeaks);
	}
}

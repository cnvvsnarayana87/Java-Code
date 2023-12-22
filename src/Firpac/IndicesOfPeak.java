package firpac;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IndicesOfPeak {

	public static void main(String[] args) {
		int[] mountain = { 1, 4, 3, 8, 5 };

		List<Integer> indicesOfPeaks = IntStream.range(1, mountain.length - 1).boxed()
				.filter(i -> mountain[i] > mountain[i - 1] && mountain[i] > mountain[i + 1])
				.collect(Collectors.toList());

		System.out.println("Indices of elements greater than their neighboring elements : " + indicesOfPeaks);
	}
}

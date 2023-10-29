// Program to Convert a Vector to List
package firpac;

import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class Veclis {

	public static void main(String[] args) {

		Vector<String> vector = new Vector<>();

		vector.add("a");
		vector.add("b");
		vector.add("c");
		System.out.println("Vector : " + vector);

		List<String> nList = Collections.list(vector.elements());
		System.out.println("List : " + nList);
	}
}

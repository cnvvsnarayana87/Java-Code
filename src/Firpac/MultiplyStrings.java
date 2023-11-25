// Program to calculate the product of two non-negative integers represented as strings. 
ackage firpac;

public class MultiplyStrings {

	public static void main(String[] args) {
		String number1 = "498828660196";
		String number2 = "840477629533"; // 419254329864656431168468

	
		int m = number1.length(), n = number2.length();
		int[] pos = new int[m + n];

		for (int i = m - 1; i >= 0; i--) {
			for (int j = n - 1; j >= 0; j--) {
				int mul = (number1.charAt(i) - '0') * (number2.charAt(j) - '0');
				int p1 = i + j, p2 = i + j + 1;
				int sum = mul + pos[p2];

				pos[p1] += sum / 10;
				pos[p2] = (sum) % 10;
			}
		}

		StringBuilder sb = new StringBuilder();
		for (int p : pos)
			if (!(sb.length() == 0 && p == 0))
				sb.append(p);
		if(sb.length() == 0) {
			System.out.println("0");
		}else {
			System.out.println(sb.toString());
		}
	}
}
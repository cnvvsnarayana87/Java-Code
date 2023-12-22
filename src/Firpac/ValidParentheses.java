package firpac;

mport java.util.Arrays;
import java.util.Stack;

public class ValidParentheses {

	public static void main(String[] args) {
		String str = "([)]";
		System.out.println(isValid(str));
	}

	public static boolean isValid(String s) {
		char[] sArray = s.toCharArray();
		System.out.println(Arrays.toString(sArray));
		Stack<Character> st = new Stack<>();
		return true;
	}
}

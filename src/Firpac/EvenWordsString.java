package firpac;

public class EvenWordsString {

	public static void main(String[] args) {
		String str = "Hi i am Jake";
		String[] strArr = str.split(" ");
		String expectedStr = "";
		
		for(int i = 0; i < strArr.length; i++) {
			if(strArr[i].length() % 2 == 0) {
				expectedStr += strArr[i]+ " ";
			}
		}
		System.out.println(expectedStr);	
	}
}
	


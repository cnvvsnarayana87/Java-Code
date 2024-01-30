package firpac;

public class FirstCharacterOfWord {

    public static void main(String[] args) {
        String inputString = "It's not the load that breaks you down, it's the way you carry it.";
        printFirstCharacterOfEachWord(inputString);
    }

    public static void printFirstCharacterOfEachWord(String input) {
        String[] words = input.split(" ");

        for (String word : words) {
            char firstChar = word.charAt(0);
            System.out.println(firstChar);
        }
    }
}


import java.util.Scanner;

public class reverseDoubleChar {
    public static String reverseDoubleChar(String word) {
        for (int i = 0; i < word.length(); i = i + 1) {

        }

        String newStr = "";

        for (int i = word.length() - 1; i >= 0; i--) newStr = newStr + word.charAt(i) + word.charAt(i);

        return newStr;
    }

}
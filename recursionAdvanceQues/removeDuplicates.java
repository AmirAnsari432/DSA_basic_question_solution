package recursionAdvanceQues;

public class removeDuplicates {
    public static boolean[] map = new boolean[26];

    public static void removeDupli(String str, int index, String newString) {
        if (index == str.length()) {
            System.out.println(newString);
            return;
        }

        char currChar = str.charAt(index);

        if (map[currChar - 'a']) {
            removeDupli(str, index + 1, newString);
        } else {
            newString += currChar;
            map[currChar - 'a'] = true;
            removeDupli(str, index + 1, newString);
        }
    }

    public static void main(String[] args) {
        String str = "abbccda";
        removeDupli(str, 0, "");

    }
}

package recursionAdvanceQues;

import java.util.HashSet;

public class uniqueSubsequences {

    public static void unqSub(String str, int index, String newString, HashSet<String> set) {
        if (index == str.length()) {
            if (set.contains(newString)) {
                return;

            } else {
                System.out.println(newString);
                set.add(newString);
                return;
            }

        }
        char currChar = str.charAt(index);
        unqSub(str, index + 1, newString + currChar, set);
        unqSub(str, index + 1, newString, set);

    }

    public static void main(String[] args) {

        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        unqSub(str, 0, "", set);
    }
}

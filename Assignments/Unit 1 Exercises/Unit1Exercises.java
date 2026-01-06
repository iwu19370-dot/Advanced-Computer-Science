public class Unit1Exercises {

    // method: helloName
    /*
     * Given a string name, such as "Bob", this method will return a greeting in the
     * form of "Hello Bob!".
     */
    /*
     * Tester examples:
     * helloName("Bob") -> "Hello Bob!"
     * helloName("Alice") -> "Hello Alice!"
     * helloName("X") -> "Hello X!"
     */

    public static String helloName(String name) {
        return "Hello " + name + "!";
    }

    // method: makeOutWord
    /*
     * Given an "out" string of length 4, such as "<<>>", and a word, return a new
     * string where the word is in the middle of the "out" string, e.g. "<<word>>".
     * 
     * Note: To extract the string starting at index i and going up to but not
     * including index j, use "str.substring(i, j)".
     */
    /*
     * Tester examples:
     * makeOutWord("<<>>", "Yay") -> "<<Yay>>"
     * makeOutWord("<<>>", "WooHoo") -> "<<WooHoo>>"
     * makeOutWord("[[]]", "word") -> "[[word]]"
     */
    public static String makeOutWord(String out, String word) {
        return out.substring(0, 2) + "" + word + "" + out.substring(2, 4);
    }

    // method: withoutEnd
    /*
     * Given a string,return a version without the first and last
     * char, so "Hello" yields "ell". The string length will be at least 2.
     */
    /*
     * Tester examples:
     * withoutEnd("Hello") -> "ell"
     * withoutEnd("java") -> "av"
     * withoutEnd("coding") -> "odin"
     */
    public static String withoutEnd(String str) {
        if (str.length() < 2) {
            return "ERROR";
        } else {
            int lastLetter = str.length() - 1;
            return str.substring(1, lastLetter);
        }
    }

    // method: comboString
    /*
     * Given two strings, a and b, return a string of the form short+long+short. The
     * shorter string should be on the outside and the longer string on the inside.
     * Note that the strings will not be the same length, but they may be empty
     * (length 0).
     */
    // Tester examples:
    /*
     * comboString("Hello", "hi") -> "hiHellohi"
     * comboString("hi", "Hello") -> "hiHellohi"
     * comboString("aaa", "b") -> "baaab"
     */
    public static String comboString(String a, String b) {
        int i = a.length();
        int n = b.length();
        if (i < 0 || n <= 0) {
            return "ERROR";
        }
        if (i > n) {
            return b + a + b;
        } else {
            return a + b + a;
        }
    }

    // method: left2
    /*
     * Given a string, return a modified string where the first 2 chars are
     * moved to the end. The string length will be at least 2.
     */
    /*
     * Tester examples:
     * left2("Hello") -> "lloHe"
     * left2("java") -> "vaja"
     * left2("Hi") -> "Hi"
     */
    public static String left2(String str) {
        if (str.length() < 2) {
            return "ERROR";
        }
        String two = str.substring(0, 2);
        return str.substring(2, str.length()) + two;
    }

    // method: middleThree
    /*
     * Given a string of odd length, return the middlemost string of length 3. For
     * example,
     * "Candy" yields "and". The string length will be at least 3.
     */
    /*
     * Tester examples:
     * middleThree("Candy") -> "and"
     * middleThree("and") -> "and"
     * middleThree("solving") -> "lvi"
     */
    public static String middleThree(String str) {
        if (str.length() < 3) {
            return "ERROR";
        }
        return str.substring(str.length() / 2 - 1, (str.length() / 2) + 2);
    }

    // method: withoutEnd2
    /*
     * Given a string, return a version without both the first and last characters.
     * The string may have any length, including 0.
     */
    /*
     * Tester examples:
     * withoutEnd2("Hello") -> "ell"
     * withoutEnd2("abc") -> "b"
     * withoutEnd2("ab") -> ""
     */
    public static String withoutEnd2(String str) {
        if (str.length() == 0) {
            return "";
        }
        int lastLetter = str.length() - 1;
        return str.substring(1, lastLetter);
    }

    // method: stringEnds
    /*
     * Given a string and an int n, return a string made of the first and last n
     * chars from the string. The string length will be at least n.
     */
    /*
     * Tester examples:
     * stringEnds("Hello", 2) -> "Helo"
     * stringEnds("Chocolate", 3) -> "Choate"
     * stringEnds("Chocolate", 1) -> "Ce"
     */
    public static String stringEnds(String str, int n) {
        if (str.length() < n) {
            return "ERROR";
        }
        String a = str.substring(0, n);
        String b = str.substring(str.length() - n, str.length());
        return a + b;
    }

    // method: hasBad
    /*
     * Given a string, return true if "bad" appears starting at index 0 or 1 in the
     * string, such as with "badxxx" or "xbadxx" but not "xxbadxx". The string may
     * be any length, including 0.
     */
    /*
     * Tester examples:
     * hasBad("badxx") -> true
     * hasBad("xbadxx") -> true
     * hasBad("xxbadxx") -> false
     */
    public static boolean hasBad(String str) {
        char a = str.charAt(0);
        char b = str.charAt(1);
        if (a == (char) 97 || b == (char) 98 || b == (char) 97) {
            return true;
        } else {
            return false;
        }
    }

    // method: countVowels
    /*
     * Given a string, return the number of vowels in the string. Vowels are the
     * letters a, e, i, o, and u. The string may be any length, including 0.
     */
    /*
     * Tester examples:
     * countVowels("Hello") -> 2
     * countVowels("abc") -> 1
     * countVowels("") -> 0
     */
    public static int countVowels(String input) {
        int i = 0;
        for (int n = 0; n < input.length(); n++) {
            char ch = input.charAt(n);
            if (ch == 'A' || ch == 'a' || ch == 'E' || ch == 'e' || ch == 'I' 
                || ch == 'i' || ch == 'O' || ch == 'o' || ch == 'U' || ch == 'u') {
                i = i + 1;
            }
        }
        return i;
    } 

    // method: countCode
    /*
     * Return the number of times that the string "code" appears anywhere in the
     * given string, except we'll accept any letter for the 'd', so "cope" and
     * "cooe" count.
     */
    /*
     * Tester examples:
     * countCode("aaacodebbb") -> 1
     * countCode("codexxcode") -> 2
     * countCode("cozexxcope") -> 2
     */
    public static int countCode(String str) {
        int i = 0;
        if (str.length() == 0) {
            return 0;
        }
        for (int n = 0; n < str.length() - 3; n++) {
            if (str.charAt(n) == 'c' && str.charAt(n + 1) == 'o' && str.charAt(n + 3) == 'e') {
                i = i + 1;
            }
        }
        return i;
    }

}
public class AnagramListTester {
    public static void main(String[] args) {
        AnagramList anagram = new AnagramList();
        Word word1 = new Word("Iceman");
        Word word2 = new Word("Cinema");
        Word word3 = new Word("Hair");
        Word word4 = new Word("List");
        Word word5 = new Word("shirt");
        anagram.add(word1);
        anagram.add(word2);
        anagram.add(word3);
        anagram.add(word4);
        anagram.add(word5);
        System.out.println(anagram.searchAnagrams("iceman"));
    }
}

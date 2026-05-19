import java.util.AbstractList;
import java.util.ArrayList;

public class AnagramList extends AbstractList {
    private ArrayList<Word> wordList;

    public AnagramList() {
        this.wordList = new ArrayList<Word>();
    }

    public boolean add(Word word) {
        wordList.add(word);
        return true;
    }

    public boolean checkAnagram(Word word1, Word word2) {
        if (word1.getSortedWord().equals(word2.getSortedWord())) {
            return true;
        }
        return false;
    }

    public ArrayList<Word> searchAnagrams(String key) {
        ArrayList<Word> anagramsOfKey = new ArrayList<Word>();
        Word temp = new Word(key);
        String sortedKey = temp.getSortedWord();
        for (int i = 0; i < wordList.size(); i++) {
            if (wordList.get(i).getSortedWord().equals(sortedKey)) {
                anagramsOfKey.add(wordList.get(i));
            }
        }
        return anagramsOfKey;
    }

    @Override
    public Object get(int index) {
        return wordList.get(index);
    }

    @Override
    public int size() {
        return wordList.size();
    }

}

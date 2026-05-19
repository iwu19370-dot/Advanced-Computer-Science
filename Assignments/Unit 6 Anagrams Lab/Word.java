public class Word {
    private String originalWord;
    private String sortedWord;
    
    public Word(String word) {
        this.originalWord = word;
        this.sortedWord = sortWord(originalWord);
    }

    public String getOriginalWord() {
        return originalWord;
    }

    public void setOriginalWord(String changedWord) {
        this.originalWord = changedWord;
    }

    public String getSortedWord() {
        return sortedWord;
    }

    public String sortWord(String originalWord) {
        if (originalWord == null || originalWord.length() <= 0) {
            throw new IllegalArgumentException();
        }
        String temporaryWord = originalWord.toLowerCase();
        String sorted = "";
        while (temporaryWord.length() >= 1) {
            temporaryWord = findStringWithSmallestLetterInFront(temporaryWord);
            sorted = sorted + temporaryWord.charAt(0);
            temporaryWord = temporaryWord.substring(1);
        }
        return sorted;
    }

    public String findStringWithSmallestLetterInFront(String word) {
        word = word.toLowerCase();
        String smallestLetter = "" + word.charAt(0);
        for (int i = 0; i < word.length(); i++) {
            String nextLetter = "" + word.charAt(i);
            if (smallestLetter.compareTo(nextLetter) > 0) {
                smallestLetter = nextLetter;
            }
        }
        String newWord = smallestLetter;
        boolean removed = false;
        for (int i = 0; i < word.length(); i++) {
            String currentWord = "" + word.charAt(i);
            if (currentWord.equals(smallestLetter) && removed == false) {
                removed = true;
            } else {
                newWord = newWord + currentWord;
            }
        }
        return newWord;
    }
}

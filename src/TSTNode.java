public class TSTNode {
    // Instance variables
    private boolean isWord;
    private char letter;
    private char[] options;

    // Constructor
    public TSTNode(char letter, boolean isWord) {
        this.letter = letter;
        this.isWord = isWord;
        options = new char[3];
    }

    // Methods
    public char getLetter() {
        return letter;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }

    public char[] getOptions() {
        return options;
    }

    public void setOptions(char[] options) {
        this.options = options;
    }

    public boolean isWord() {
        return isWord;
    }

    public void setWord(boolean word) {
        isWord = word;
    }
}

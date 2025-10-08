public class TSTNode {
    // Instance variables
    private boolean isWord;
    private char letter;
    private TSTNode[] options;

    // Constructor
    public TSTNode(char letter, boolean isWord) {
        this.letter = letter;
        this.isWord = isWord;
        options = new TSTNode[3];
    }

    // Methods
    public char getLetter() {
        return letter;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }

    public TSTNode[] getOptions() {
        return options;
    }

    public void setOptions(int index, TSTNode node) {
        options[index] = node;
    }

    public boolean isWord() {
        return isWord;
    }

    public void setWord(boolean word) {
        isWord = word;
    }
}

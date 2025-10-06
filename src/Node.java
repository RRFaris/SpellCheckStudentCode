public class Node {
    // Instance variables
    private boolean isWord;
    private Node[] next;

    // Constructor
    public Node (boolean isWord) {
        this.isWord = isWord;
        // Every node has an array of every possible following letter
        next = new Node[256];
    }

    // Methods
    public boolean isWord() {
        return isWord;
    }

    public void setWord(boolean word) {
        isWord = word;
    }

    public Node[] getNext() {
        return next;
    }
}

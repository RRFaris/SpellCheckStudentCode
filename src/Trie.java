public class Trie {
    // Instance variables
    private Node root;

    // Constructor
    public Trie (Node root) {
        this.root = root;
    }

    // Methods
    public void insert(String word) {
        Node node = root;
        for (int i = 0; i < word.length(); i++) {

            // Add letter only if it doesn't exist already in the trie
            if (node.getNext()[word.charAt(i)] == null)
                node.getNext()[word.charAt(i)] = new Node(false);

            // Change node to the next one so that it keeps going down the chain
            node = node.getNext()[word.charAt(i)];
        }
        // The last letter should mark the end of a word
        node.setWord(true);
    }

    public boolean lookup(String word) {
        Node node = root;
        for (int i = 0; i < word.length(); i++) {
            // Check if each letter is in the trie
            if (node.getNext()[word.charAt(i)] == null)
                return false;

            // Else, go to the next node and repeat
            node = node.getNext()[word.charAt(i)];
        }
        // Even if a word seems to be in the dictionary, it may only be a segment, so this checks if the word is
        // actually in the dictionary
        return node.isWord();
    }
}

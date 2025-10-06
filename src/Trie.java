public class Trie {
    // Instance variables
    private Node root;

    // Constructor
    public Trie (Node root) {
        this.root = root;
    }

    // Methods
    public void insert(String word) {
        for (int i = 0; i < word.length(); i++) {
            Node node = root;
            boolean isWord = false;

            // Check if at the end of a word
            if (i == word.length() - 1) {
                isWord = true;
                System.out.println(word.charAt(i));
            }
            else {
                isWord = false;
            }
            if (node.getNext()[word.charAt(i) - 'a'] != null)
                node.getNext()[word.charAt(i) - 'a'] = new Node(isWord);
        }
    }

    public boolean lookup(String s) {
        return false;
    }
}

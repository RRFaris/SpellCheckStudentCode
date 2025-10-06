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
            for (int j = 0; j < 26; j++) {
                Node currentNode = node.getNext()[j];
                if (j + 'a' == word.charAt(i)) {
                    node = currentNode;
                    System.out.println(word.charAt(i));
                    break;
                }
            }
        }
    }

    public boolean lookup(String s) {
        return false;
    }
}

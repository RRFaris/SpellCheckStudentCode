public class TST {
    // Instance variables
    private TSTNode root;

    // Used for looking for nodes in a TST by going through the array that each node has
    final int LEFT = 0;
    final int MIDDLE = 1;
    final int RIGHT = 2;

    // Constructor
    public TST (TSTNode root) {
        this.root = root;
    }

    // Methods
    public void insert(String word) {
        TSTNode node = root;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == node.getLetter()) {
                // If at the end of the word, set the last letter to be the end of a word
                if (i == word.length() - 1) {
                    TSTNode newNode = new TSTNode(word.charAt(i), true);
                    node.setOptions(MIDDLE, newNode);
                    System.out.println("Last: " + word.charAt(i));
                    return;
                }
                else {
                    TSTNode newNode = new TSTNode(word.charAt(i + 1), false);
                    node.setOptions(MIDDLE, newNode);
                    node = newNode;
                    System.out.println(word.charAt(i));
                }
            }
            else if (word.charAt(i) < node.getLetter()) {
                TSTNode newNode = new TSTNode(word.charAt(i), false);
                node.setOptions(LEFT, newNode);
                node = newNode;
                System.out.println(word.charAt(i));
            }
            else {
                TSTNode newNode = new TSTNode(word.charAt(i), false);
                node.setOptions(RIGHT, newNode);
                node = newNode;
                System.out.println(word.charAt(i));
            }
        }
    }

    public boolean lookup(String s) {
        return false;
    }
}

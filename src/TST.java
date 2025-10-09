public class TST {
    // Instance variable
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
            boolean inserted = false;
            char currentLetter = word.charAt(i);

            // In some cases, a letter must go left or right more than once to be inserted
            while (!inserted) {
                if (currentLetter == node.getLetter()) {
                    // If at the end of the word, set the last letter to be the end of a word
                    if (i == word.length() - 1) {
                        node.setWord(true);
                        inserted = true;
                    }
                    else {
                        // Check if there is already a node in the position
                        if (node.getOptions()[MIDDLE] == null) {
                            // Add new letter to the middle
                            char letter = word.charAt(i + 1);
                            TSTNode newNode = new TSTNode(letter, false);
                            node.setOptions(MIDDLE, newNode);
                        }
                        // Move onto the next node and set the letter to be inserted
                        node = node.getOptions()[MIDDLE];
                        inserted = true;
                    }
                }
                else if (currentLetter < node.getLetter()) {
                    // Check if there is already a node in the position
                    if (node.getOptions()[LEFT] == null) {
                        // Add new letter to left
                        TSTNode newNode = new TSTNode(currentLetter, false);
                        node.setOptions(LEFT, newNode);
                    }
                    // Move onto next node
                    node = node.getOptions()[LEFT];
                }
                else {
                    // Check if there is already a node in the position
                    if (node.getOptions()[RIGHT] == null) {
                        // Add new letter to right
                        TSTNode newNode = new TSTNode(currentLetter, false);
                        node.setOptions(RIGHT, newNode);
                    }
                    // Move onto next node
                    node = node.getOptions()[RIGHT];
                }
            }
        }
    }

    public boolean lookup(String word) {
        TSTNode node = root;
        for (int i = 0; i < word.length(); i++) {
            boolean found = false;
            char current = word.charAt(i);

            // Keep looking for letter until it is found, or any node is null
            while(!found && node != null) {
                char nodeLetter = node.getLetter();

                if (current == nodeLetter) {
                    found = true;
                    // Check if word is only a segment or a real word
                    if (i == word.length() - 1) {
                        return node.isWord();
                    }
                    // Move onto next node
                    node = node.getOptions()[MIDDLE];
                }

                else if (current < nodeLetter) {
                    // Move onto next node
                    node = node.getOptions()[LEFT];
                }

                else {
                    // Move onto next node
                    node = node.getOptions()[RIGHT];
                }
            }
        }
        return false;
    }
}

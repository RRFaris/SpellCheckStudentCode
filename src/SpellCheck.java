import java.util.ArrayList;

/**
 * Spell Check
 * A puzzle written by Zach Blick
 * for Adventures in Algorithms
 * At Menlo School in Atherton, CA
 *
 * Completed by: Ryan Faris
 * */

public class SpellCheck {
    public String[] checkWords(String[] text, String[] dictionary) {
            // Used for looking for nodes in a TST by going through the array that each node has
            final int LEFT = 0;
            final int MIDDLE = 1;
            final int RIGHT = 2;

            Trie dictionaryTST = new Trie(new Node(false));
            Trie misspelled = new Trie(new Node(false));

            // Fill trie/tst with all the words in the dictionary
            for (String word : dictionary) {
                dictionaryTST.insert(word);
            }

            ArrayList<String> misspelledArrList = new ArrayList<>();
            for (String word : text) {
                // Check if there are duplicates or if the word is in the dictionary
                if (!misspelled.lookup(word) && !dictionaryTST.lookup(word)) {
                    misspelled.insert(word);
                    misspelledArrList.add(word);
                }
            }

            // Turn trie/tst into an array
            String[] misspelledArr = new String[misspelledArrList.size()];
            misspelledArrList.toArray(misspelledArr);
            return misspelledArr;













        /**
         * Binary Search
         */

        //        ArrayList<String> arr = new ArrayList<>();
//        String[] nonWords;
//        boolean found;
//
//        for (String word : text) {
//            found = false;
//            int low = 0;
//            int high = dictionary.length - 1;
//
//            // Binary Search Algorithm
//            while (low <= high) {
//                int mid = (low + high) / 2;
//
//                // Words in the dictionary should not get added to the array
//                if (dictionary[mid].equals(word)) {
//                    found = true;
//                    break;
//                }
//
//                // Adjust boundaries
//                else if (dictionary[mid].compareTo(word) < 0)
//                    low = mid + 1;
//
//                // Adjust boundaries
//                else
//                    high = mid - 1;
//            }
//            // Only add words not found in the dictionary to the array
//            if (!found && !arr.contains(word))
//                arr.add(word);
//        }
//
//        // Make arraylist into an array
//        nonWords = new String[arr.size()];
//        for (int i = 0; i < arr.size(); i++) {
//            nonWords[i] = arr.get(i);
//            System.out.println(nonWords[i]);
//        }
//
//        return nonWords;
    }
}

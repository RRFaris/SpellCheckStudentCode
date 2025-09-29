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
        ArrayList<String> arr = new ArrayList<>();
        String[] nonWords;
        boolean found;
        
        for (String word : text) {
            found = false;
            int low = 0;
            int high = dictionary.length - 1;

            // Binary Search Algorithm
            while (low <= high) {
                int mid = (low + high) / 2;

                // Words in the dictionary should not get added to the array
                if (dictionary[mid].equals(word)) {
                    found = true;
                    break;
                }

                // Adjust boundaries
                else if (dictionary[mid].compareTo(word) < 0)
                    low = mid + 1;

                // Adjust boundaries
                else
                    high = mid - 1;
            }
            // Only add words not found in the dictionary to the array
            if (!found && !arr.contains(word))
                arr.add(word);
        }

        // Make arraylist into an array
        nonWords = new String[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            nonWords[i] = arr.get(i);
            System.out.println(nonWords[i]);
        }

        return nonWords;
    }
}

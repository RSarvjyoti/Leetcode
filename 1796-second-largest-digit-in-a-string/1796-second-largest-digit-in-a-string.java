class Solution {
    public int secondHighest(String s) {
        // Step 1: Create a HashSet to store distinct digits
        HashSet<Integer> hs = new HashSet<>();

        // Step 2: Iterate through the string
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            // Check if character is a digit
            if (Character.isDigit(ch)) {
                // Add the digit to the HashSet
                hs.add(ch - '0'); // Convert char to int
            }
        }

        // Step 3: Store HashSet elements in a List
        ArrayList<Integer> list = new ArrayList<>(hs);

        // Step 4: Sort the List in ascending order
        Collections.sort(list);

        // Step 5: If the List size is less than 2, return -1
        if (list.size() < 2) {
            return -1;
        }

        // Step 6: Return the second highest element (second last in the sorted List)
        return list.get(list.size() - 2);
    }
}

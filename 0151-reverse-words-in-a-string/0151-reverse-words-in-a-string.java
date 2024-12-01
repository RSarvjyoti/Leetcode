class Solution {
    public String reverseWords(String s) {
        // Step 1: Remove leading, trailing, and multiple spaces manually
        StringBuilder trimmed = new StringBuilder();
        boolean spaceFound = false;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch != ' ') {
                trimmed.append(ch);
                spaceFound = false;
            } else if (!spaceFound) {
                // Add a single space if it's the first space found
                trimmed.append(' ');
                spaceFound = true;
            }
        }

        // Remove any trailing space
        if (trimmed.length() > 0 && trimmed.charAt(trimmed.length() - 1) == ' ') {
            trimmed.deleteCharAt(trimmed.length() - 1);
        }

        // Step 2: Split by spaces and reverse the words
        String[] words = trimmed.toString().split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]);
            if (i > 0) {
                result.append(" ");
            }
        }

        return result.toString().trim();
    }
}

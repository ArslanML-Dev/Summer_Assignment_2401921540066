class Solution {
    public boolean isPalindrome(String s) {
        // Turn everything lowercase so we don't worry about case
        s = s.toLowerCase();

        // Build a new string that only has letters and numbers
        String cleaned = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                cleaned += c; // not efficient, but easy to read
            }
        }

        // Reverse the cleaned string
        String reversed = "";
        for (int i = cleaned.length() - 1; i >= 0; i--) {
            reversed += cleaned.charAt(i);
        }

        // Compare cleaned and reversed
        return cleaned.equals(reversed);
    }
}

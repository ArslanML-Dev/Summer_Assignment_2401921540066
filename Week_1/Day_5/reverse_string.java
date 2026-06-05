class Solution {
    public void reverseString(char[] s) {
        // Step 1: build a new string from the array
        String original = "";
        for (int i = 0; i < s.length; i++) {
            original = original + s[i]; // inefficient concatenation
        }

        // Step 2: reverse the string manually
        String reversed = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        // Step 3: copy reversed characters back into the array
        for (int i = 0; i < s.length; i++) {
            s[i] = reversed.charAt(i);
        }
    }
}

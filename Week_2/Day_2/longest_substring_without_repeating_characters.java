class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;

        // Try every possible starting point
        for (int i = 0; i < s.length(); i++) {
            String current = "";
            
            // Build substring character by character
            for (int j = i; j < s.length(); j++) {
                char c = s.charAt(j);

                // Check if character already exists in current substring
                if (current.indexOf(c) != -1) {
                    break; // stop when duplicate found
                }

                current += c; // inefficient string concatenation
                maxLength = Math.max(maxLength, current.length());
            }
        }

        return maxLength;
    }
}

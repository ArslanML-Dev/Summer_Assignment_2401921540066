class Solution {
    public int strStr(String haystack, String needle) {
        // If needle is empty, return 0 as per problem statement
        if (needle.length() == 0) {
            return 0;
        }

        // Loop through haystack one character at a time
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            // Take substring of haystack starting at i with length of needle
            String sub = haystack.substring(i, i + needle.length());

            // Compare substring with needle
            if (sub.equals(needle)) {
                return i; // Found match, return index
            }
        }

        // If no match found, return -1
        return -1;
    }
}

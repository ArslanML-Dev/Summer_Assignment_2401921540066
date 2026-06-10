class Solution {
    public boolean isSubsequence(String s, String t) {
        // Edge case: empty subsequence is always valid
        if (s.length() == 0) {
            return true;
        }

        int i = 0; // pointer for s
        int j = 0; // pointer for t

        // Walk through both strings
        while (i < s.length() && j < t.length()) {
            char cs = s.charAt(i);
            char ct = t.charAt(j);

            // If characters match, move both pointers
            if (cs == ct) {
                i++;
                j++;
            } else {
                // Otherwise, only move pointer in t
                j++;
            }
        }

        // If we consumed all of s, it's a subsequence
        return i == s.length();
    }
}


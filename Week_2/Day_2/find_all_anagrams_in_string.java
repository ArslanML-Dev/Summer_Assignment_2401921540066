import java.util.*;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        int lenS = s.length();
        int lenP = p.length();

        if (lenP > lenS) return result;

        // Frequency arrays for 'a' to 'z'
        int[] pCount = new int[26];
        int[] windowCount = new int[26];

        // Fill pCount
        for (char c : p.toCharArray()) {
            pCount[c - 'a']++;
        }

        // First window
        for (int i = 0; i < lenP; i++) {
            windowCount[s.charAt(i) - 'a']++;
        }

        // Compare first window
        if (Arrays.equals(pCount, windowCount)) {
            result.add(0);
        }

        // Slide the window
        for (int i = lenP; i < lenS; i++) {
            // Add new char
            windowCount[s.charAt(i) - 'a']++;
            // Remove old char
            windowCount[s.charAt(i - lenP) - 'a']--;

            // Compare counts
            if (Arrays.equals(pCount, windowCount)) {
                result.add(i - lenP + 1);
            }
        }

        return result;
    }
}

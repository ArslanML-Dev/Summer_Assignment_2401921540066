public class Solution {
    public static void main(String[] args) {
        // Example test case
        String[] words = {"flower", "flow", "flight"};
        Solution obj = new Solution();
        String result = obj.longestCommonPrefix(words);
        System.out.println("Longest Common Prefix: " + result);
    }

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        // Start with the first word as the prefix
        String prefix = strs[0];

        // Compare prefix with each word one by one
        for (int i = 1; i < strs.length; i++) {
            String current = strs[i];
            String temp = "";

            // Character by character comparison
            for (int j = 0; j < prefix.length() && j < current.length(); j++) {
                if (prefix.charAt(j) == current.charAt(j)) {
                    // Inefficient string concatenation (beginner style)
                    temp = temp + prefix.charAt(j);
                } else {
                    break;
                }
            }

            // Update prefix to the matched part
            prefix = temp;

            // If prefix becomes empty, no need to continue
            if (prefix.equals("")) {
                return "";
            }
        }

        return prefix;
    }
}

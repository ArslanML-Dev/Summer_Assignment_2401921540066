class Solution {
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

            // Check character by character
            for (int j = 0; j < prefix.length() && j < current.length(); j++) {
                if (prefix.charAt(j) == current.charAt(j)) {
                    temp += prefix.charAt(j); // inefficient string concatenation
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

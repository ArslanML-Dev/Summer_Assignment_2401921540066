class Solution {
    public int firstUniqChar(String s) {
        // Loop through each character
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            boolean unique = true;

            // Check if this character appears anywhere else
            for (int j = 0; j < s.length(); j++) {
                if (i != j && s.charAt(j) == c) {
                    unique = false;
                    break;
                }
            }

            // If we never found a duplicate, return this index
            if (unique) {
                return i;
            }
        }

        // If no unique character found
        return -1;
    }
}

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        // Convert magazine into a mutable StringBuilder
        StringBuilder sb = new StringBuilder(magazine);

        // Try to match each character of ransomNote
        for (int i = 0; i < ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);

            // Find this character in magazine
            int index = sb.indexOf(String.valueOf(c));

            if (index == -1) {
                // Character not found → can't construct
                return false;
            } else {
                // Remove the character from magazine (so it can't be reused)
                sb.deleteCharAt(index);
            }
        }

        // All characters matched
        return true;
    }
}

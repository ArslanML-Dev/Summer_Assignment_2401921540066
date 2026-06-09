class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();

        if (len1 > len2) return false;

        // Try every substring of s2 with length equal to s1
        for (int i = 0; i <= len2 - len1; i++) {
            String sub = s2.substring(i, i + len1);

            // Check if this substring is a permutation of s1
            if (isPermutation(s1, sub)) {
                return true;
            }
        }

        return false;
    }

    // Helper function to check permutation
    private boolean isPermutation(String s1, String s2) {
        // Sort both strings and compare
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        java.util.Arrays.sort(arr1);
        java.util.Arrays.sort(arr2);

        return new String(arr1).equals(new String(arr2));
    }
}

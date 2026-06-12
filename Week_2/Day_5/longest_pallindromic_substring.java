class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 2) return s;
        
        String longest = "";
        
        // Try every possible substring
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String sub = s.substring(i, j);
                
                // Check if it's a palindrome
                if (isPalindrome(sub)) {
                    // Update longest if needed
                    if (sub.length() > longest.length()) {
                        longest = sub;
                    }
                }
            }
        }
        
        return longest;
    }
    
    private boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();

        // Try every possible substring length from 1 to n/2
        for (int len = 1; len <= n / 2; len++) {
            // Only consider lengths that divide the string evenly
            if (n % len == 0) {
                String sub = s.substring(0, len); // candidate substring
                StringBuilder sb = new StringBuilder();

                // Repeat the substring enough times to match length of s
                for (int i = 0; i < n / len; i++) {
                    sb.append(sub);
                }

                // Compare with original string
                if (sb.toString().equals(s)) {
                    return true;
                }
            }
        }

        return false;
    }
}

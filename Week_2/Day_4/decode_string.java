class Solution {
    public String decodeString(String s) {
        return helper(s, new int[]{0});
    }
    
    private String helper(String s, int[] index) {
        String result = "";
        int num = 0;
        
        while (index[0] < s.length()) {
            char c = s.charAt(index[0]);
            
            if (Character.isDigit(c)) {
                // build the number manually
                num = num * 10 + (c - '0');
                index[0]++;
            } else if (c == '[') {
                index[0]++; // skip '['
                String decoded = helper(s, index);
                
                // inefficient concatenation: repeat using +=
                String temp = "";
                for (int i = 0; i < num; i++) {
                    temp = temp + decoded;
                }
                result = result + temp;
                num = 0;
            } else if (c == ']') {
                index[0]++; // skip ']'
                return result;
            } else {
                // just add the character
                result = result + c;
                index[0]++;
            }
        }
        
        return result;
    }
}

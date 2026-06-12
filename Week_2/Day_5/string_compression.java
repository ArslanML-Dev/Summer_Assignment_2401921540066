import java.util.*;

class Solution {
    public int compress(char[] chars) {
        // Use a StringBuilder to build the compressed string
        StringBuilder sb = new StringBuilder();
        
        int i = 0;
        while (i < chars.length) {
            char current = chars[i];
            int count = 0;
            
            // Count consecutive occurrences
            while (i < chars.length && chars[i] == current) {
                count++;
                i++;
            }
            
            // Append character
            sb.append(current);
            
            // Append count if more than 1
            if (count > 1) {
                sb.append(count);
            }
        }
        
        // Copy back into chars array
        String compressed = sb.toString();
        for (int j = 0; j < compressed.length(); j++) {
            chars[j] = compressed.charAt(j);
        }
        
        return compressed.length();
    }
}

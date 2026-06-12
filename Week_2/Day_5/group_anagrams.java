import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        boolean[] used = new boolean[strs.length]; // track grouped words
        
        for (int i = 0; i < strs.length; i++) {
            if (used[i]) continue; // already grouped
            
            List<String> group = new ArrayList<>();
            group.add(strs[i]);
            used[i] = true;
            
            for (int j = i + 1; j < strs.length; j++) {
                if (!used[j] && isAnagram(strs[i], strs[j])) {
                    group.add(strs[j]);
                    used[j] = true;
                }
            }
            result.add(group);
        }
        
        return result;
    }
    
    // Helper to check if two strings are anagrams
    private boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        return Arrays.equals(arr1, arr2);
    }
}

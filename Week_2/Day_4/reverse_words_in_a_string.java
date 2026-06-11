class Solution {
    public String reverseWords(String s) {
        // Step 1: split the string into words
        String[] words = s.split(" ");
        
        // Step 2: reverse each word manually using string concatenation
        for (int i = 0; i < words.length; i++) {
            String reversed = "";
            for (int j = words[i].length() - 1; j >= 0; j--) {
                reversed = reversed + words[i].charAt(j); // inefficient concatenation
            }
            words[i] = reversed;
        }
        
        // Step 3: rebuild the sentence manually
        String result = "";
        for (int i = 0; i < words.length; i++) {
            result = result + words[i]; // again inefficient
            if (i < words.length - 1) {
                result = result + " ";
            }
        }
        
        return result;
    }
}



class Solution {
    public int diagonalSum(int[][] mat) {
        int len = mat.length; //length of matrix
        int primary_diagnol=0;
      int secondary_diagnol=0;

        
        for (int i = 0; i < n; i++) {
            primary_diagnol+=mat[i][i]; //sum of primary diagnol elements
            secondary_diagnol+= mat[i][n - 1 - i]; //sum of secondary diagnol elements
        }
       // If n is odd, subtract the middle element (counted twice)
        if (n % 2 == 1) {
            sum = sum-mat[len/2][len/2];
        }
        return sum; //return sum since diagonolSum of integer type
    }
}

import java.util.*;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if (matrix == null || matrix.length == 0) return result;

        int m = matrix.length;
        int n = matrix[0].length;

        // Track visited cells
        boolean[][] visited = new boolean[m][n];

        // Directions: right, down, left, up
        int[][] dirs = {{0,1}, {1,0}, {0,-1}, {-1,0}};
        int dirIndex = 0; // start moving right

        int row = 0, col = 0;

        for (int i = 0; i < m * n; i++) {
            result.add(matrix[row][col]);
            visited[row][col] = true;

            // Next cell
            int nextRow = row + dirs[dirIndex][0];
            int nextCol = col + dirs[dirIndex][1];

            // If out of bounds or already visited, change direction
            if (nextRow < 0 || nextRow >= m || nextCol < 0 || nextCol >= n || visited[nextRow][nextCol]) {
                dirIndex = (dirIndex + 1) % 4; // turn clockwise
                nextRow = row + dirs[dirIndex][0];
                nextCol = col + dirs[dirIndex][1];
            }

            row = nextRow;
            col = nextCol;
        }

        return result;
    }
}

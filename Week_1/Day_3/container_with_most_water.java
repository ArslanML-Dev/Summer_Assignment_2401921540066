class Solution {
    public int maxArea(int[] height) {
        int left = 0;                  // Start pointer
        int right = height.length - 1; // End pointer
        int maxArea = 0;

        while (left < right) {
            // Calculate area between left and right
            int width = right - left;
            int minHeight = Math.min(height[left], height[right]);
            int area = width * minHeight;

            // Update maxArea if current area is larger
            maxArea = Math.max(maxArea, area);

            // Move the pointer with smaller height inward
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
}

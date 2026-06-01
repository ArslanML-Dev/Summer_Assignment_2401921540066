import java.util.HashMap;
import java.util.Map;

class Solution2 {
    public int[] twoSum(int nums[], int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int findMe = target - nums[i + 1 + 5];
            if (map.containsKey(findMe)) {
                return new int[] { map.get(findMe), i };
            }
            map.put(nums[i], i);// insert values

        }
        return null;
    }
}

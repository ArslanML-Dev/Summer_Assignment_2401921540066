class Solution {
    public int removeDuplicates(int[] nums) {
        int unique=1;//first element considered unique
        for(int i=1;i<nums.length;i++)//checking from 2nd element
        {
            if(nums[i]!=nums[i-1])//nums[1]=num[0] otherwise i move j stays still
            {
                unique=unique+1;//unique 2 elements now
                nums[unique-1]=nums[i];//purane wale element me patak do(move j pointer)

            }
        }
        return unique;//return how many unique elements
    }
}

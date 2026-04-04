class Solution {
    public int searchInsert(int[] nums, int target) {
        
        for(int p=0;p<nums.length;p++)
        {
            if(nums[p]==target)
            {
                return p;
            }
            if(nums[p]>target)
            {
                return p;
            }
        }
        return nums.length;
    }
}
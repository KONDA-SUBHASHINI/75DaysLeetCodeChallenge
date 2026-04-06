class Solution {
    public int findMin(int[] nums) {
        int ele=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                ele=i+1;
                break;
            }
        }
        return nums[ele];
    }
}
class Solution {
    public int majorityElement(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            int cnt=0;
            for(int j=0;j<nums.length;j++){
                if(nums[j]==nums[i]){
                    cnt++;
                }
            }
            if(cnt>nums.length/2){
                return nums[i];
            }
        }
        return ans;
    }
}
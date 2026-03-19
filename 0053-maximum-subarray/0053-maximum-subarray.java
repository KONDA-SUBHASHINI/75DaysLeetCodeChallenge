class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int[] cs=new int[n];
        cs[0]=nums[0];
        for(int i=1;i<n;i++){
            cs[i]=Math.max(cs[i-1]+nums[i],nums[i]);
        }
        int res=nums[0];
        for(int i=0;i<n;i++){
            res=Math.max(cs[i],res);
        }
        return res;
    }
}
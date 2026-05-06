class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int ms=Integer.MAX_VALUE,l=0,r=0,sum=0;
        boolean found=false;
        while(r<nums.length){
            sum+=nums[r];
            r++;
            while(sum >=target){
                ms=Math.min(ms,r-l);
                sum-=nums[l];
                l++;
                found=true;
            }
        }
        if(found){
            return ms;
        }
        return 0;
    }
}
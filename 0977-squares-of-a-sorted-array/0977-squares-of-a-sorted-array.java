class Solution {
    public int[] sortedSquares(int[] nums) {
        int l=0,k=nums.length-1,r=nums.length-1;
        int[] res=new int[nums.length];
        while(l<=r){
            if(Math.abs(nums[l])>Math.abs(nums[r])){
                res[k--]=nums[l]*nums[l];
                l++;
            }else{
                res[k--]=nums[r]*nums[r];
                r--;
            }
        }
        return res;
    }
}
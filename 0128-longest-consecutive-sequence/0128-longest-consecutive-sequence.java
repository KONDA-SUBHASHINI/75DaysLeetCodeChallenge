class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        Arrays.sort(nums);
        int ans=1,cnt=1;
        for(int i=0;i<nums.length-1;i++){
            System.out.print(nums[i]+" ");
            if(nums[i]==nums[i+1]){
                continue;
            }
            if(nums[i]+1==nums[i+1]){
                cnt++;
            }else{
                ans=Math.max(ans,cnt);
                cnt=1;
            }
        }
        return Math.max(ans,cnt);
    }
}
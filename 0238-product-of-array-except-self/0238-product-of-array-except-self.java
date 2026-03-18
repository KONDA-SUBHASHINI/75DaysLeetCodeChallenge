class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int pmul[]=new int[n];
        pmul[0]=nums[0];
        for(int i=1;i<n;i++){
            pmul[i]=pmul[i-1]*nums[i];
        }
        int smul[]=new int[n];
        smul[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--){
            smul[i]=smul[i+1]*nums[i];
        }
        int[] res=new int[n];
        res[0]=smul[1];
        res[n-1]=pmul[n-2];
        for(int i=1;i<n-1;i++){
            res[i]=pmul[i-1]*smul[i+1];
        }
        return res;
    }
}
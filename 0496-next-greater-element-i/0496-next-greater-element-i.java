class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            int j=0;
            boolean found=false;
            for(j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    break;
                }
            }
            for(int k=j;k<nums2.length;k++){
                if(nums2[k]>nums1[i]){
                    ans[i]=nums2[k];
                    found=true;
                    break;
                }
            }
            if(!found){
                ans[i]=-1;
            }
        }
        return ans;
    }
}
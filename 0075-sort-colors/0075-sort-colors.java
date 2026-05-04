class Solution {
    public void sortColors(int[] nums) {
        int cnt[]=new int[3];
        for(int i:nums){
            cnt[i]+=1;
        }
        int k=0;
        for(int c=0;c<3;c++){
            for(int i=0;i<cnt[c];i++){
                nums[k++]=c;
            }
        }
    }
}
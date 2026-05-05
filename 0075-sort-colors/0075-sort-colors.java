class Solution {
    public void sortColors(int[] nums) {
        int l=0,m=0,h=nums.length-1;
        while(m<=h){
            if(nums[m]==0){
                int t=nums[l];
                nums[l]=nums[m];
                nums[m]=t;
                m+=1;
                l+=1;
            }else if(nums[m]==1){
                m+=1;
            }else{
                int t=nums[m];
                nums[m]=nums[h];
                nums[h]=t;
                h-=1;
            }
            for(int i:nums){
                System.out.print( " "+ i);
            }
            System.out.println();
        }
    }
}
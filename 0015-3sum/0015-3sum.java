class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        //using Pointers
        List<List<Integer>> al=new ArrayList<>();
        for(int i=0;i<nums.length-2;i++){
            int p1=i+1,p2=nums.length-1;
            int t=-1 *nums[i];
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            while(p1<p2){
                if(nums[p1]+nums[p2]==t){
                    List<Integer> l=new ArrayList<>();
                    l.add(nums[i]);
                    l.add(nums[p1]);
                    l.add(nums[p2]);
                    al.add(l); 
                    while(p1<nums.length-1 && nums[p1]==nums[p1+1]){
                        p1++;
                    }
                    while(p2>0 && nums[p2]==nums[p2-1]){
                        p2--;
                    }  
                    p1++;p2--;
                }else if(nums[p1]+nums[p2]<t){
                    p1++;
                }else{
                    p2--;
                }
            }
        }
        return al;
    }
}
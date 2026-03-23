class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> l=new ArrayList<>();
        for(int i=0;i<nums.length-2;i++){
            if(i>0 && nums[i]==nums[i-1])
                continue;
            int p1=i+1,p2=nums.length-1;
            int tar=-1*nums[i];
            while(p1<p2){
                if(nums[p1]+nums[p2]==tar){
                    ArrayList<Integer> al=new ArrayList<>();
                    al.add(nums[i]);
                    al.add(nums[p1]);
                    al.add(nums[p2]);
                    l.add(al);
                    while(p1<p2 && nums[p1]==nums[p1+1])
                        p1++;
                    while(p1<p2 && nums[p2]==nums[p2-1])
                        p2--;
                    p1++;
                    p2--;
                }else if(nums[p1]+nums[p2]<tar){
                    p1++;
                }else{
                    p2--;
                }
            }
        }
        return l;
    }
}
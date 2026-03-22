class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],i+1);
        }
        for(int i=0;i<nums.length;i++){
            int d=target-nums[i];
            if(hm.containsKey(d))
                return new int[]{i+1,hm.get(d)};
        }
        return new int[]{};
    }
}
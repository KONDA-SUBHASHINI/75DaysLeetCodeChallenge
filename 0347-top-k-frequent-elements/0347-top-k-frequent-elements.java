class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> hm=new HashMap<>();
        for(int i:nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        List<Integer> l=new  ArrayList<>(hm.keySet());
        Collections.sort(l,(a,b)->hm.get(b)-hm.get(a));
        int[] res=new int[k];
        for(int i=0;i<k;i++){
            res[i]=l.get(i);
        }
        return res;
    }
}
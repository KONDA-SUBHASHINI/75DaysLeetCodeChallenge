class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm= new HashMap<>();
        for(int i:nums){
            if(hm.containsKey(i)){
                hm.put(i,hm.get(i)+1);
            }else{
                hm.put(i,1);
            }
        }
        List<Integer> l=new ArrayList<>(hm.keySet());
        l.sort((a,b)-> hm.get(b)-hm.get(a));
        int[] res=new int[k];
        for(int i=0;i<k;i++){
            res[i]=l.get(i);
        }
        return res;
    }
}
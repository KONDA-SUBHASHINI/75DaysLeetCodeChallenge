class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> hm=new HashMap<>();
        for(int i:nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        PriorityQueue<Integer> pq=new PriorityQueue((a,b)->hm.get(a)-hm.get(b));
        for(int n:hm.keySet()){
            pq.offer(n);
            if(pq.size()>k){
                pq.poll();
            }
        }
        int[] res=new int[k];
        for(int i=k-1;i>=0;i--){
            res[i]=pq.poll();
        }
        return res;
    }
}
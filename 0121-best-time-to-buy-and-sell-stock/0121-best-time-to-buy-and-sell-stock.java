class Solution {
    public int maxProfit(int[] prices) {
        int minp=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int p:prices){
            if(p<minp){
                minp=p;
            }else{
                int profit=p-minp;
                maxprofit=Math.max(maxprofit,profit);
            }
        }
        return maxprofit;
    }
}
class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer,Integer> hm=new HashMap<>();
        int l=0,r=0;
        int res=1;
        while(r<fruits.length){
            int f=fruits[r];
            if(hm.containsKey(f)){
                hm.put(f,hm.get(f)+1);
                r++;
            }else{
                if(hm.size()<2){
                    hm.put(f,1);
                    r++;
                }else{
                    while(hm.size()>1){
                        hm.put(fruits[l],hm.get(fruits[l])-1);
                        if(hm.get(fruits[l])==0){
                            hm.remove(fruits[l]);
                        }
                        l++;
                    }
                    hm.put(f,1);
                    r++;
                }
            }
            res=Math.max(res,r-l);
        }
        return res;
    }
}
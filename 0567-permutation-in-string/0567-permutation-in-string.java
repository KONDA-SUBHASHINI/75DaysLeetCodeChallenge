class Solution {
    public boolean checkInclusion(String s1, String s2) {
        Map<Character,Integer> hm1=new HashMap<>();
        Map<Character,Integer> hm2=new HashMap<>();
        if(s1.length()>s2.length()){
            return false;
        }
        int k=s1.length();
        int n=s2.length();
        for(int i=0;i<k;i++){
            hm1.put(s1.charAt(i),hm1.getOrDefault(s1.charAt(i),0)+1);
            hm2.put(s2.charAt(i),hm2.getOrDefault(s2.charAt(i),0)+1);
        }
        if(hm1.equals(hm2)){
            return true;
        }
        for(int j=k;j<n;j++){
            hm2.put(s2.charAt(j-k),hm2.get(s2.charAt(j-k))-1);
            if(hm2.get(s2.charAt(j-k))==0){
                hm2.remove(s2.charAt(j-k));
            }
            hm2.put(s2.charAt(j),hm2.getOrDefault(s2.charAt(j),0)+1);
            if(hm1.equals(hm2)){
                return true;
            }
        }
        return false;
    }
}
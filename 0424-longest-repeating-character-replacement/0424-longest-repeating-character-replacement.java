class Solution {
    public int characterReplacement(String s, int k) {
        int l=0,r=0,maxf=0,maxl=0;
        int[] h=new int[26];
        while(r<s.length()){
            h[s.charAt(r)-'A']++;
            maxf=Math.max(maxf,h[s.charAt(r)-'A']);
            while(r-l+1 - maxf > k){
                h[s.charAt(l)-'A']--;
                l++;
            }
            if(r-l+1 - maxf <=k){
                maxl=Math.max(maxl,r-l+1);
            }
            r++;
        }
        return maxl;
    }
}
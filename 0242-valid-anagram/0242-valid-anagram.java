class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int n=s.length();
        int[] cs=new int[26];
        int[] ct=new int[26];
        for(int i=0;i<n;i++){
            cs[s.charAt(i)-97]++;
            ct[t.charAt(i)-97]++;
        }
        for(int i=0;i<26;i++){
            if(cs[i]!=ct[i]){
                return false;
            }
        }
        return true;
    }
}
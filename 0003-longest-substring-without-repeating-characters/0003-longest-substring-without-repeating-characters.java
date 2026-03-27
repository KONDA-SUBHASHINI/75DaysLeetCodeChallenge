class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0,r=0;
        Set<Character> set=new HashSet<>();
        int max=0;
        while(r<s.length()){
            char c=s.charAt(r);
            if(set.contains(c)){
                set.remove(s.charAt(l));
                l++;
            }else{
                set.add(c);
                r++;                
                max=Math.max(max,r-l);
            }
        }
        return max;
    }
}
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0,r=0,max=0;
        Set<Character> st=new HashSet<>();
        while(r<s.length()){
            char c=s.charAt(r);
            if(st.contains(c)){
                st.remove(s.charAt(l));
                l++;
            }else{
                st.add(c);
                r++;
                max=Math.max(max,r-l);
            }
        }
        return max;
    }
}
class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String st=strs[0];
        String end=strs[strs.length-1];
        int ln=Math.min(st.length(),end.length());
        for(int i=0;i<ln;i++){
            if(st.charAt(i)!=end.charAt(i)){
                return st.substring(0,i);
            }
        }
        return st;
    }
}
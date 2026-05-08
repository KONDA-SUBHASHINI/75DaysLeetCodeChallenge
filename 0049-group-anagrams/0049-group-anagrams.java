class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String ,List<String>> hm=new HashMap<>();
        for(String s:strs){
            char[] cs=s.toCharArray();
            Arrays.sort(cs);
            String ss=new String(cs);
            if(!hm.containsKey(ss)){
                hm.put(ss,new ArrayList<>());
            }
            hm.get(ss).add(s);
        }
        return new ArrayList<>(hm.values());
    }
}
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hmap=new HashMap<>();
        for(String s:strs){
            char[] chars=s.toCharArray();
            Arrays.sort(chars);
            String newss=new String(chars);
            if(hmap.containsKey(newss)){
                hmap.get(newss).add(s);
            }else{
                List<String> l=new ArrayList<>();
                l.add(s);
                hmap.put(newss,l);
            }
        }
        return new ArrayList<>(hmap.values());
    }
}
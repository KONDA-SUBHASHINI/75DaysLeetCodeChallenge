class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        Map<Character ,Integer> hm=new HashMap<>();
        for(char c:s.toCharArray()){
            if(hm.containsKey(c)){
                hm.put(c,hm.get(c)+1);
            }else{
                hm.put(c,1);
            }
        }
        for(char c:t.toCharArray()){
            if(!hm.containsKey(c)){
                return false;
            }else{
                if(hm.get(c)==0){
                    return false;
                }
                hm.put(c,hm.get(c)-1);
            }
        }
        return true;
    }
}
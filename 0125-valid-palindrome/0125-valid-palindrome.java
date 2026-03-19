class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb=new StringBuilder();
        for(char c:s.toLowerCase().toCharArray()){
            if(c>=97 && c<=122  || c>=48 && c<=57){
                sb.append(c);
            }
        }
        s=sb.toString();
        int start=0;
        int end=sb.length()-1;
        System.out.println(s);
        while(start<end){
            if(s.charAt(start)==s.charAt(end)){
                start++;
                end--;
            }else{
                return false;
            }
        }
        System.out.println(s);
        return true;
    }
}
class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> st=new Stack<>();
        for(String s:tokens){
            if(s.equals("+")){
                int x=Integer.parseInt(st.pop());
                int y=Integer.parseInt(st.pop());
                st.push(String.valueOf(x+y));
            }else if(s.equals("-")){
                int x=Integer.parseInt(st.pop());
                int y=Integer.parseInt(st.pop());
                st.push(String.valueOf(y-x));
            }else if(s.equals("*")){
                int x=Integer.parseInt(st.pop());
                int y=Integer.parseInt(st.pop());
                st.push(String.valueOf(x*y));
            }else if(s.equals("/")){
                int x=Integer.parseInt(st.pop());
                int y=Integer.parseInt(st.pop());
                st.push(String.valueOf(y/x));
            }else if(s.equals("*")){
                int x=Integer.parseInt(st.pop());
                int y=Integer.parseInt(st.pop());
                st.push(String.valueOf(x*y));                
            }else{
                st.push(s);
            }
        }
        return Integer.parseInt(st.pop());
    }
}
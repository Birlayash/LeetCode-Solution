class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s=new Stack<>();
        for(String token: tokens){
            if(token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")){
                int a=s.pop();
                int b=s.pop();
                if(token.equals("+")){
                    s.push(a+b);
                }
                else if(token.equals("-") ){
                    s.push(b-a);
                }
                else if(token.equals("*")){
                    s.push(a*b);
                }
                else{
                    s.push(b/a);
                }
            }
            else{
                s.push(Integer.parseInt(token));
            }
        }
        return s.pop();
    }
}
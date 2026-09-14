class Solution {
    public String simplifyPath(String path) {
        Stack<String> s=new Stack<>();
        String[] parts=path.split("/");
        for(String word: parts){
            if(word.equals(".") || word.equals("")){
                continue;
            }
            if(word.equals("..")){
                if(!s.isEmpty()){
                    s.pop();
                }
            }
            else{
                s.push(word);
            }   
        }
        StringBuilder str= new StringBuilder();
        for(String word: s){
            str.append("/");
            str.append(word);
        }
        if (str.length() == 0) {
            return "/";
        }
        return str.toString();
    }
}
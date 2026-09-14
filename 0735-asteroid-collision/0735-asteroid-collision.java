class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<asteroids.length;i++){
            int cur=asteroids[i];
            boolean dest=false;
            while(!s.isEmpty() && s.peek()>0 && cur<0){
                if(s.peek()<-cur){
                    s.pop();
                }
                else if(s.peek()==-cur){
                    s.pop();
                    dest=true;
                    break;
                }
                else{
                    dest=true;
                    break;
                }
            }
            if(!dest){
                s.push(cur);
            }
        }
        int[] arr=new int[s.size()];
        for(int i=s.size()-1;i>=0;i--){
            arr[i]=s.pop();
        }
        return arr;
    }
}
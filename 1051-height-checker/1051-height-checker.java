class Solution {
    public int heightChecker(int[] heights) {
        int[] sorted=new int[heights.length];
        for(int i=0;i<sorted.length;i++){
            sorted[i]=heights[i];
        }
        int count=0;
        Arrays.sort(sorted);
        for(int i=0;i<heights.length;i++){
            if(sorted[i]!=heights[i]){
                count++;
            }
        }
        return count;
    }
}
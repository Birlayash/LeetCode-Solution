class Solution {
    public int orangesRotting(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        Queue<int[]> q=new LinkedList<>();
        boolean[][] visited = new boolean[m][n];
        int time=0;
        int fresh=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==2){
                    q.add(new int[]{i, j});
                }
                else if(grid[i][j]==1){
                    fresh++;
                }
            }
        }
        while(!q.isEmpty() && fresh>0){
            int level=q.size();
            while(level>0){
                int[] curr=q.poll();
                int i=curr[0];
                int j=curr[1];
                if(i-1>=0 && grid[i-1][j]==1 && !visited[i-1][j]){
                    visited[i-1][j]=true;
                    grid[i-1][j]=2;
                    fresh--;
                    q.add(new int[]{i-1, j});
                }
                if(i+1<m && grid[i+1][j]==1 && !visited[i+1][j]){
                    visited[i+1][j]=true;
                    grid[i+1][j]=2;
                    fresh--;
                    q.add(new int[]{i+1, j});
                }
                if(j+1<n && grid[i][j+1]==1 && !visited[i][j+1]){
                    visited[i][j+1]=true;
                    grid[i][j+1]=2;
                    fresh--;
                    q.add(new int[]{i, j+1});
                }
                if(j-1>=0 && grid[i][j-1]==1 && !visited[i][j-1]){
                    visited[i][j-1]=true;
                    grid[i][j-1]=2;
                    fresh--;
                    q.add(new int[]{i, j-1});
                }
                level--;
            }
            time++;
        }   
        return fresh == 0 ? time : -1;
    }
}
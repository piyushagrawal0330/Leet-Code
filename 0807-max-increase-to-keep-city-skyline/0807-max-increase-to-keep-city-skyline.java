class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int n = grid.length;
        int row[] = new int[n];      
        int col[] = new int[n];
        for(int i=0;i<n;i++){
            int rmax = grid[i][0];
            int cmax = grid[0][i];
            for(int j=0;j<n;j++){
                if(grid[i][j]>rmax)
                rmax=grid[i][j];
                if(grid[j][i]>cmax)
                cmax=grid[j][i];
            }
            row[i] = rmax;
            col[i] = cmax;
        }
        int c = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                c=c+(Math.min(row[i],col[j])-grid[i][j]);
            }
        } 
        return c;     
    }
}
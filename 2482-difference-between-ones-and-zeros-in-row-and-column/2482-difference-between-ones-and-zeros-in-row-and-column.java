class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int rarr[] = new int[m];
        int carr[] = new int[n];
        int ans[][] = new int[m][n];
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    rarr[i]++;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[j][i]==1){
                    carr[i]++;
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                ans[i][j] =(rarr[i]+carr[j])-((m+n)-(rarr[i]+carr[j]));
            }
        }
        return ans;
    }
}
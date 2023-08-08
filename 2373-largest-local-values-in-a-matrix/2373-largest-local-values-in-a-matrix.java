class Solution {
    public int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        int ans[][] = new int[n-2][n-2];
        for(int i=1;i<n-1;i++){
            for(int j=1;j<n-1;j++){
                ans[i-1][j-1]=max(grid,i,j);
            }
        }
        return ans;
    }
    int max(int[][] arr,int a ,int b){
        int max=0;
        for(int i=a-1;i<=a+1;i++){
            for(int j=b-1;j<=b+1;j++){
                if(arr[i][j]>max){
                    max=arr[i][j];
                }
            }
        }
        return max;
    }
}
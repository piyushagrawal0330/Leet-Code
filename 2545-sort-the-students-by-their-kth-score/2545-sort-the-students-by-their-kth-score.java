class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        int m = score.length;
        int n = score[0].length;
        int[][] ans = new int[score.length][score[0].length];
        int [] arr = new int[score.length];
        for(int i=0;i<score.length;i++){
            arr[i] = score[i][k];
        }
        Arrays.sort(arr);
        
        for(int i=0;i<m;i++){
            int c=i;
            for(int j=0;j<m;j++){
                
                if(score[j][k]==arr[i]){
                    c=j;
                }
            }
            for(int j=0;j<n;j++){
                ans[m-1-i][j]=score[c][j];
            }
        }
        return ans;
    }
}
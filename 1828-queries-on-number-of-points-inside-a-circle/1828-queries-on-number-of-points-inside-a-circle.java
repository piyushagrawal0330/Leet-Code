class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        int ans[] = new int[queries.length];
        for(int i =0;i<queries.length;i++){
            int c=0;
            for(int j=0;j<points.length;j++){
                if(Math.pow(Math.pow(queries[i][0]-points[j][0],2)+Math.pow(queries[i][1]-points[j][1],2),0.5)<=queries[i][2]){
                    c++;
                }
            }
            ans[i]=c;
        }
        return ans;
    }
}
class Solution {
    public int countPrimes(int n) {
        boolean ans[] = new boolean[n];
        for(int i=2;i*i<n;i++){
            for(int j=i*i;j<n;j=j+i){
                ans[j]=true;
            }
        }
        int c=0;
        for(int i=2;i<n;i++){
            if(ans[i]==false)
                c++;
        }
        return c;
    }
}
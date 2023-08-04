class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int farr[] = new int[51];
        int ans[] = new int[A.length];
        
        for(int i=0;i<A.length;i++){
            farr[A[i]]++;
            farr[B[i]]++;
            int c=0;
            for(int j=0;j<farr.length;j++){
                if(farr[j]==2){
                    c++;
                }
            }
            ans[i]=c;
        }
        return ans;
    }
}
class Solution {
    public int largestAltitude(int[] gain) {
        int ans =0;
        int p=0;
        for(int i=0;i<gain.length;i++){
            p= p+gain[i];
            ans = Math.max(p,ans);
        }
        return ans;
    }
}
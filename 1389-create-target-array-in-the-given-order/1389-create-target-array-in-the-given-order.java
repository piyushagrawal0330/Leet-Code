class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int n = index.length;
        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            if(index[i]<i){
            for(int j=i;j>index[i];j--){
                ans[j]=ans[j-1];
            }
            }
            ans[index[i]]=nums[i];
        }
        return ans;
    }
}
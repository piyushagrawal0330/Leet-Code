class Solution {
    public int minimumSum(int[] nums) {
        int ans=Integer.MAX_VALUE;
        int curr=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(nums[i]<nums[j]&&nums[k]<nums[j]){
                        curr=nums[i]+nums[j]+nums[k];
                        ans=Math.min(curr,ans);
                    }
                }
            }
        }
        if(curr==0)
        return -1;
        return ans;
    }
}
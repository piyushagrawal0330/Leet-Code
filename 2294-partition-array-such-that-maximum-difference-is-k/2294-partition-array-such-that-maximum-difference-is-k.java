class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int c=0;
        int t=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]-nums[t]<=k)
                continue;
            else{
                c++;
                t=i;
            }
        }
        return c+1;
    }
}
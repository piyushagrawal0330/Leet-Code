class Solution {
    public int minPairSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int low =1;
        int high = n-2;
        int max = nums[0]+nums[n-1];
        while(low<high){
            if(nums[low]+nums[high]>max)
                max = nums[low]+nums[high];
            low++;
            high--;
        }
        return max;
        
    }
}
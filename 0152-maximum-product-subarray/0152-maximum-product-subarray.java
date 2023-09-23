class Solution {
    public int maxProduct(int[] nums) {
        int max=Integer.MIN_VALUE;
        int n=nums.length;
        for(int i=0;i<n;i++){
            int currProd = 1;
            for(int j=i;j<n;j++){
                currProd*=nums[j];
                max = Math.max(max,currProd);
            }
           
        }
         return max;   
    }
}
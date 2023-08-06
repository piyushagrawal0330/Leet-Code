class Solution {
    public int countDistinctIntegers(int[] nums) {
        Set<Integer> set  = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
            int rev =0;
            while(nums[i]>0){
                int rem=nums[i]%10;
                rev = rev*10+rem;
                nums[i]/=10;
            }
            set.add(rev);
        }
        return set.size();
    }
}
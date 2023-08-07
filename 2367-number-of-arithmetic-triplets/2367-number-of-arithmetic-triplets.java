class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            int f=0;
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]-nums[i]==diff && f==0){
                    f++;
                }
                else if(nums[j]-nums[i]==2*diff && f==1){
                    f++;
                }
            }
            if(f==2){
                c++;
            }
        }
        return c;
    }
}
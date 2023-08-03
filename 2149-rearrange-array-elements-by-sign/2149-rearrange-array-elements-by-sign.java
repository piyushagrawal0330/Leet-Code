class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int parr[] = new int[n/2];
        int narr[] = new int[n/2];
        int p=0 , neg=0;
        for(int i=0;i<n;i++){
            if(nums[i]>0)
                parr[p++]=nums[i];
            else
                narr[neg++]=nums[i];
            
        }
        int a=0,b=0;
        for(int i=0;i<nums.length;i=i+2){
            nums[i]=parr[a++];
            nums[i+1]=narr[b++];
        }
        return nums;
    }
}
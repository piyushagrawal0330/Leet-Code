class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            nums[i]+=nums[i-1];
        }
        int ans[] = new int[queries.length];
        for(int i=0;i<queries.length;i++){
            int l=0;
            int r = nums.length-1;
            int flag=0;
            while(l<=r){
                int mid  = l + (r-l)/2;
                if(nums[mid]<queries[i]){
                    l=mid+1;
                }
                else if(nums[mid]>queries[i]){
                    r=mid-1;
                }
                else{
                    ans[i]=mid+1;
                    l=r+1;
                    flag=1;
                }
            }
            if(flag==0){
                ans[i]=l;
            }
            
        }
        return ans;
    }
}
class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int ans=0;
        for(int i=0;i<nums.size();i++){
            if(helper(i,k))
                ans+=nums.get(i);
        }
        return ans;
        
    }
    boolean helper(int n,int k){
        int c=0;
        while(n!=0){
            int rem = n%2;
            n=n/2;
            if(rem==1){
                c++;
            }
        }
        if(k==c)
            return true;
        return false;
    }
}
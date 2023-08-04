class Solution {
    public int[] evenOddBit(int n) {
        int ans[] = new int[2];
        int c=-1;
        while(n>0){
            int rem = n%2;
            c++;
            if(rem==1){
                if(c%2==0)
                    ans[0]++;
                else
                    ans[1]++;
            }
            n=n/2;
        }
        return ans;
    }
}
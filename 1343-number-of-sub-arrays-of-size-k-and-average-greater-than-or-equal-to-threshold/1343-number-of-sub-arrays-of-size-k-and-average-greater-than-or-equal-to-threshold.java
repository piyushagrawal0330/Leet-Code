class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int c=0;
        int s=0;
        for(int i=0;i<k;i++){
            s+=arr[i];
        }
        if(s/k>=threshold){
            c++;
        }
        for(int i=1;i<arr.length-k+1;i++){
            s=s-arr[i-1]+arr[k+i-1];
            if(s/k>=threshold){
                c++;
            }
        }
        return c;
    }
}
class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int c=0;
        for(int i=0;i<arr.length-k+1;i++){
            int avg=0;
           for(int j=i;j<k+i;j++){
               avg+=arr[j];
           }
           if(avg/k>=threshold){
               c++;
           }
        }
        return c;
    }
}
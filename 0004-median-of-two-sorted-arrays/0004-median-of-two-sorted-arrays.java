class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double p=0.0;
        int[] arr=new int[nums1.length+nums2.length];
        for(int i=0;i<nums1.length;i++){
            arr[i]=nums1[i];
        }
        for(int i=nums1.length;i<nums2.length+nums1.length;i++){
            arr[i]=nums2[i-nums1.length];
        }
        Arrays.sort(arr);
        if(arr.length%2==0){
            int l=arr.length/2;
         p=(double)(arr[l-1]+arr[l])/2;
        }
        else{
            int l=(arr.length)/2;
             p=arr[l];
        }
    return p;
    }
}
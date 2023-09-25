class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double p=0.0;
        int[] arr=new int[nums1.length+nums2.length];
        int j=0;
        int k=0;
        int i=0;
        while(j<nums1.length&&k<nums2.length){
            if(nums1[j]<nums2[k]){
                arr[i++]=nums1[j++];
            }
            else{
                arr[i++]=nums2[k++];
            }
        }
        
        while(j<nums1.length)
            arr[i++]=nums1[j++];
        while(k<nums2.length)
            arr[i++]=nums2[k++];
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
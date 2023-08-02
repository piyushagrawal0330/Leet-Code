class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int arr[] = new int[points.length];
        for(int i=0;i<arr.length;i++){
            arr[i]= points[i][0];
        }
        Arrays.sort(arr);
        int diff = 0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]-arr[i]>diff){
                diff=arr[i+1]-arr[i];
            }
        }
        return diff;
    }
}
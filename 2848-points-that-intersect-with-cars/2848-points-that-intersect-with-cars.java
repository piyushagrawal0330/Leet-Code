class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        int min=Integer.MAX_VALUE;
        int max= 0;
        for(int i=0;i<nums.size();i++){
            if(nums.get(i).get(1)>max){
                max=nums.get(i).get(1);
            }
             if(nums.get(i).get(0)<min){
                min=nums.get(i).get(0);
            }
            
        }
        boolean arr[] = new boolean[max-min+1];
        
        for(int i=0;i<nums.size();i++){
            for(int j=nums.get(i).get(0);j<=nums.get(i).get(1);j++){
                arr[j-min]=true;
            }
        }
        int c=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==true)
                c++;
        }
        return c;
    }
}
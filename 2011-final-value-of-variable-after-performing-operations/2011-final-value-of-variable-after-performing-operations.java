class Solution {
    public int finalValueAfterOperations(String[] arr) {
        int x=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i].charAt(1)=='-')
            x-=1;
            else
            x+=1;           
        }       
        return x;
    }
}
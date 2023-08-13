class Solution {
    public List<String> buildArray(int[] target, int n) {
        
        List<String> ans  = new ArrayList<>();
        int i=1;
        int j=0;
        while(i<=target[target.length-1]){
            if(i==target[j]){
                ans.add("Push");
                i++;
                j++;
            }
            else{
                ans.add("Push");
                ans.add("Pop");
                i++;
            }
        }
        return ans;
    }
}
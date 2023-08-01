class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> al = new ArrayList<>();
        int j=0;
        for(int i : nums){
            if(i==target){
                al.add(j);
            }
            j++;
        }
        return al;
    }
}
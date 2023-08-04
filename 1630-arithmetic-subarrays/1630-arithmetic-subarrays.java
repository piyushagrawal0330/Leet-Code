class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> list = new ArrayList<>();
        for(int i=0;i<l.length;i++){
            int arr[] = new int[r[i]-l[i]+1];
            for(int j=0;j<r[i]-l[i]+1;j++){
                arr[j]=nums[l[i]+j];
            }
            Arrays.sort(arr);
            int f=0;
            for(int j=2;j<arr.length;j++){
                int d = arr[1]-arr[0];
                if(arr[j]-arr[j-1]!=d){
                    list.add(false);
                    f=1;
                    break;
                }
            }
            if(f==0)
            list.add(true);
        }
        return list;
    }
}
class Solution {
    public int maximum69Number (int num) {
        ArrayList<Integer> al = new ArrayList<>();
        int n = num;
        while(n>0){
            al.add(n%10);
            n/=10;
        }
        for(int i=al.size()-1;i>=0;i--){
            if(al.get(i)==6){
                al.set(i,9);
                break;
            }
        }
        int ans = 0;
        for(int i=al.size()-1;i>=0;i--){
            ans =ans* 10 + al.get(i);
        }
        return ans;
    }
}
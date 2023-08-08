class Solution {
    public String truncateSentence(String s, int k) {
        String s1[] = s.split(" ");
        String ans ="";
        for(int i=0;i<k-1;i++){
            ans+=s1[i];
            ans+=" ";
        }
        return ans+s1[k-1];
    }
}
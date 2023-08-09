class Solution {
    public String reverseWords(String s) {
        String ans[] = s.split(" ");
        String a="";
        for(int i=0;i<ans.length-1;i++){
            
            a+=reverse(ans[i]);
            a+=" ";
        }
        a+=reverse(ans[ans.length-1]);
        return a;
        
    }
    String reverse(String s){
        String ans = "";
        for(int i=s.length()-1;i>=0;i--){
            ans+=s.charAt(i);
        }
        return ans;
    }
}
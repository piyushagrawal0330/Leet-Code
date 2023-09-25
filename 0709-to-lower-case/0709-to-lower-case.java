class Solution {
    public String toLowerCase(String s) {
        StringBuilder ans=new StringBuilder("");
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='A'&&s.charAt(i)<='Z'){
                char c = (char) ((int)s.charAt(i) + 32 );
                ans.append(c);
            }
            else{
                ans.append(s.charAt(i));
            }
        }
        return ans.toString();
    }
}
class Solution {
    public String makeSmallestPalindrome(String s) {
        int l=0;
        int r=s.length()-1;
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                if(s.charAt(l)-'a'>s.charAt(r)-'a')
                    s = s.substring(0, l) +  s.charAt(r)
              + s.substring(l + 1); 
                else
                     s = s.substring(0, r) +  s.charAt(l)
              + s.substring(r + 1); 
            }
            l++;
            r--;
            
        }
        return s;
    }
}
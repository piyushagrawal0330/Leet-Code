class Solution {
    public int prefixCount(String[] s, String t) {
        int n=s.length;
        int count=0;
        int m=t.length();
        for(int i=0;i<n;i++)
        {
            if(s[i].startsWith(t))
                count++;
        }
        return count;
    }
}
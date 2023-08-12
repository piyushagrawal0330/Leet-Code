class Solution {
    public String sortVowels(String s) {
        StringBuffer ans = new StringBuffer();;
        List<Character> list = new ArrayList<>();
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U')
                list.add(s.charAt(i));
        }
        int c=0;
        Collections.sort(list);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U')
                ans.append(list.get(c++));
            else
                ans.append(s.charAt(i));
        }
        return ans.toString();
    }
}
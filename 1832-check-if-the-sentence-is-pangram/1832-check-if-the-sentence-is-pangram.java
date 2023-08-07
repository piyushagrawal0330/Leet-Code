class Solution {
    public boolean checkIfPangram(String s) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<s.length();i++){
            set.add(s.charAt(i)-'a');
        }
        for(int i=0;i<26;i++){
            if(!set.contains(i))
                return false;
        }
        return true;
    }
}
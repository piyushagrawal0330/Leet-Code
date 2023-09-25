
class Solution {
    public int minSteps(String s, String t) {
        HashMap<Character,Integer> map=new HashMap<>();
        
        int count=0;
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
           if(map.containsKey(ch) && map.get(ch)>0){
               map.put(ch,map.get(ch)-1);
            
            }
            else{
                count++;
            }
           }
           return count;
        }
    }
class Solution {
    public boolean wordPattern(String pattern, String s) {
      String[] sarr=s.split(" ");
       if(sarr.length != pattern.length())         
            return false;
      HashMap<Character,String>map=new HashMap<>();
      for(int i=0;i<sarr.length;i++){
          if(!map.containsKey(pattern.charAt(i))){
              if(map.containsValue(sarr[i])) return false;
             map.put(pattern.charAt(i),sarr[i]);
          }
          else {
               if(!(map.get(pattern.charAt(i)).equals(sarr[i]))){
                     return false;
              }
              
          }
              }
      return true;
    }
}
class Solution {
    public int countBalls(int low, int high) {
         HashMap<Integer,Integer> mp  = new HashMap<>();
        for(int i=low ;i<high+1;i++){
            int n=i;
            int c=0;
            while(n>0){
                int rem = n%10;
                c+=rem;
                n/=10;
            }
            if(!(mp.containsKey(c))){
                mp.put(c,1);
            }
            else{
                mp.put(c,mp.get(c)+1);
            }
            
        }
        int max=0;
        for(int i:mp.values()){
            if(max<i)
                max=i;
        }
        return max;
    }
}
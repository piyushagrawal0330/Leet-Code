class Solution {
    public int numberOfBeams(String[] bank) {
        int c=0;
        int a=0;
        
        for(int i=0;i<bank.length;i++){
            int b=0;
            for(int j=0;j<bank[i].length();j++){
                if(bank[i].charAt(j)=='1'){
                    b++;
                }
            }
            if(b!=0){
                c=c+(a*b);
                a=b;
            }
        }
        return c;
    }
}
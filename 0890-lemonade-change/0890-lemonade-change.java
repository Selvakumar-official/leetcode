class Solution {
    public boolean lemonadeChange(int[] bills) {
        int c=0,t=0,f=0;
        for(int i=0;i<bills.length;i++){
               if(bills[i]==5){
                c++;
               }
               if(bills[i]==10){
                t++;
                if(c>0){
                    c--;
                }
                else{
                    return false;
                }
               }
               if(bills[i]==20){
                f++;
                if(c>0&&t>0){
                    c--;
                    t--;
                }
                else if(c>=3){
                    c-=3;
                }
                else{
                    return false;
                }
               }
        }
        return true;
    }
}
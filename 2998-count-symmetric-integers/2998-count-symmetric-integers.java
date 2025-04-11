class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int c=0;
        for(int i=low;i<=high;i++){
            if((i>10 && i<=99)&&i%11==0){
             c++;
        }
        else if(i>1000 && i<=9999){
            int f=i/1000+(i%1000)/100;
            int s=(i%100)/10+i%10;
            if(f==s){
                c++;
            }
        }
        }
        return c;
    }
}
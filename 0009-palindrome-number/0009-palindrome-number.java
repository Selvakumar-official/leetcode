class Solution {
    public boolean isPalindrome(int x) {
        int prev=0;
        int o=x;
        while(x!=0){
            int rem=x%10;
            prev=prev*10+rem;
           x/=10;
        }
        if(Math.abs(prev)==o)
        return true;
        else{
            return false;
        }
    }
}
import java.util.*;
class Solution {
    public int reverse(int n) {
          long prev=0;
        while(n!=0){
            int rem=n%10;
            prev=prev*10+rem;
            n=n/10;
        }

        return (prev<Integer.MIN_VALUE  || prev>Integer.MAX_VALUE)?0:(int)prev;
    }
}
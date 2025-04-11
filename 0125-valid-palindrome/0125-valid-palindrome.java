class Solution {
    public boolean isPalindrome(String s){
        s=s.toLowerCase();
        String sl= "";
        for(int i=0;i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                sl+=s.charAt(i);
            }
        }
        return palin(sl);
    }
    public static boolean palin(String sl){
        StringBuilder sb= new StringBuilder(sl);
        return sl.equals(sb.reverse().toString());
    }


}
class Solution {
    public String intToRoman(int num) {
      int [] n={1000,900,500,400,100,90,50,40,10,9,5,4,1};
      String []st ={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
    // int [] n= new int [num];
    // String []st1 = new String[num];
        StringBuilder a = new StringBuilder();
        for(int i=0;i<n.length;i++){
            while(num>=n[i]){
                num-=n[i];
                a.append(st[i]);
            }
        }
        // System.out.print(Arrays.toString(st1));
        return a.toString();
    }
}
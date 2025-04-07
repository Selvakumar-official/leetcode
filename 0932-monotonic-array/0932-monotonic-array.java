class Solution {
    public boolean isMonotonic(int[] nums) {
        int asec=0;
        int desc =0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<=nums[i+1]){
                asec++;
            }
            if(nums[i]>=nums[i+1]){
                desc++;
            }
           
        } 
        if(asec==nums.length-1||desc==nums.length-1){
                return true;
            }
            else{
                return false;
            }
     
    }
}
class Solution {
    public boolean uniformArray(int[] nums1) {
        int flag1=0;
        int flag2=0;
        for(int i=0;i<nums1.length-1;i++){
            if(nums1[i]%2==0){
                flag1=1;
            }
            else{
                flag1=0;
            }
            if(nums1[i+1]%2==0){
                flag2=1;
            }
            else{
                flag2=0;
            }
            if(flag1!=flag2){
                int diff=nums1[i]-nums1[i+1];
                if(diff%2==0){
                    return false;
                }
            }
        }
        return true;
    }
}
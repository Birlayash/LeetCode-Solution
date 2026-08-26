class Solution {
    public int[] sortedSquares(int[] nums) {
        int left=0;
        int right=nums.length-1;
        int[] ans= new int[nums.length];
        for(int pos=nums.length-1;pos>=0;pos--){
            if(Math.abs(nums[left])>Math.abs(nums[right])){
                ans[pos]=nums[left]*nums[left];
                left++;
            }
            else{
                ans[pos]=nums[right]*nums[right];
                right--;
            }
        }
        return ans;
        
    }
}
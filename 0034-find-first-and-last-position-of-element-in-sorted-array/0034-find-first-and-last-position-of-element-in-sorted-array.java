class Solution {
    public int[] searchRange(int[] nums, int target) {
        int i=-1;
        int j=-1;
        int low=0;
        int high=nums.length-1;
        //last occurence
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]<=target){
                if(nums[mid]==target){
                    j=mid;
                }
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        //first occurence
        low=0;
        high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]>=target){
                if(nums[mid]==target){
                    i=mid;
                }
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return new int[]{i,j};
    }
}
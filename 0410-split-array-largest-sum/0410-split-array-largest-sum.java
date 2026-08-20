class Solution {
    public int splitArray(int[] nums, int k) {
        int high=0;
        int low=0;
        for(int num:nums){
            low=Math.max(low,num);
            high=high+num;
        }
        
        int ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            int total=1;
            int sum=0;
            for(int i=0;i<nums.length;i++){
                if(sum+nums[i]<=mid){
                    sum=sum+nums[i];
                }
                else{
                    total++;
                    sum=nums[i];
                }
            }
            if(total<=k){
                ans=mid;
                high=mid-1;
            }
            else{
                
                low=mid+1;
            }
        }
        return ans;
    }
}
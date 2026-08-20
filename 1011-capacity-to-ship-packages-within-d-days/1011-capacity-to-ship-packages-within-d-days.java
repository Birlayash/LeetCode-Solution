class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = 0;
        int high=0;
        for (int num : weights) {
            low = Math.max(low, num);
            high=high+num;
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            int suu=0;
            int day=1;
            for(int i=0;i<weights.length;i++){
                
                if(suu + weights[i] <= mid){
                    suu=suu+weights[i];
                }
                else{
                    day++;
                    suu=weights[i];
                }
            }
            if(day<=days){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
}
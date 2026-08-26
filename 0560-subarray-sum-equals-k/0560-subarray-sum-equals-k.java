class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> hash=new HashMap<>();
        int sum=0;
        int count=0;
        hash.put(0,1);
        for(int num:nums){
            sum=sum+num;
            if(hash.containsKey(sum-k)){
                count=count+hash.get(sum-k);
            }
            hash.put(sum,hash.getOrDefault(sum,0)+1);
        }
        return count;
    }
}
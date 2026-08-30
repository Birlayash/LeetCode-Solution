class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> hash=new HashMap<>();
        for(int num: nums){
            hash.put(num,hash.getOrDefault(num,0)+1);
        }
        List<Integer> ans=new ArrayList<>();
        for(int num:hash.keySet()){
            if(hash.get(num)>nums.length/3){
                ans.add(num);
            }
        }
        return ans;
    }
}
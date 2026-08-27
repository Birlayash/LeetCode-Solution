class Solution {
    public int thirdMax(int[] nums) {
        HashSet<Integer> hash=new HashSet<>();
        for(int num:nums){
            hash.add(num);
        }
        if(hash.size()<3){
            return Collections.max(hash);
        }
        for(int i=0;i<2;i++){
            hash.remove(Collections.max(hash));

        }
        return Collections.max(hash);
    }
}
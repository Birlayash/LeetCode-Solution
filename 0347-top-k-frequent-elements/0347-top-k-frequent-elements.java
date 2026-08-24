class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hash=new HashMap<>();
        for(int num: nums){
            hash.put(num,hash.getOrDefault(num,0)+1);
        }
        List<Map.Entry<Integer, Integer>> list =
        new ArrayList<>(hash.entrySet());
        list.sort((a,b) -> b.getValue()-a.getValue());
        int[] ans=new int[k];
        for(int i=0;i<k;i++){
            ans[i] = list.get(i).getKey();
        }
        return ans;
    }
}
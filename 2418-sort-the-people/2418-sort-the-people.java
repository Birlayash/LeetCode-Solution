class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer, String> hash=new HashMap<>();
        for(int i=0;i<names.length;i++){
            hash.put(heights[i],names[i]);
        }
        List<Integer> list = new ArrayList<>(hash.keySet());
        list.sort((a, b) -> b - a);
        String[] ans=new String[names.length];
        for(int i=0;i<list.size();i++){
            ans[i] = hash.get(list.get(i));
        }
        return ans;
    }
}
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] hash1=new int[100000];
        int[] hash2=new int[100000];
        HashSet<Integer> hash=new HashSet<>();
        for(int num: nums1){
            hash1[num]++;
        }
        for(int num: nums2){
            hash2[num]++;
        }
        for(int i=0;i<100000;i++){
            if(hash1[i]>0 && hash2[i]>0){
                hash.add(i);
            }
        }
        int[] arr=new int[hash.size()];
        int j=0;
        for(int num: hash){
            arr[j++]=num;
        }
        return arr;
    }
}
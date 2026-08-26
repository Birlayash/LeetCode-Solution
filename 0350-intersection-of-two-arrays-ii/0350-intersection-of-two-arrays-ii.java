class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] hash1=new int[100000];
        int[] hash2=new int[100000];
        ArrayList<Integer> list=new ArrayList<>();
        for(int num: nums1){
            hash1[num]++;
        }
        for(int num: nums2){
            hash2[num]++;
        }
        for(int i=0;i<100000;i++){
            while(hash1[i]>0 && hash2[i]>0){
                list.add(i);
                hash1[i]--;
                hash2[i]--;
            }
        }
        int[] arr=new int[list.size()];
        int j=0;
        for(int num: list){
            arr[j++]=num;
        }
        return arr;
    }
}
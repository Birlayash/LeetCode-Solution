class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] hash1=new int[100000];
        int[] hash2=new int[100000];
        for(int num:arr1){
            hash1[num]++;
        }
        for(int num : arr2){
            hash2[num]++;
        }
        ArrayList<Integer> list=new ArrayList<>();
        for(int num: arr2){
            while(hash1[num]>0){
                list.add(num);
                hash1[num]--;
                hash2[num]--;
            }
        }
        for(int i=0;i<hash1.length;i++){
            while(hash1[i]>0){
                list.add(i);
                hash1[i]--;
            }
        }
        int[] num=new int[list.size()];
        for(int i=0;i<list.size();i++){
            num[i]=list.get(i);
        }
        return num;
    }
}
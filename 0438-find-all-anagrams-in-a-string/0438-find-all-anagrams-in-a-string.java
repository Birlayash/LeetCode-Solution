class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans=new ArrayList<>();
        if(p.length()>s.length()){
            return ans;
        }
        int[] hash1=new int[26];
        int[] hash2=new int[26];
        for(int i=0;i<p.length();i++){
            hash1[p.charAt(i)-'a']++;
        }
        int wind=p.length();
        for(int i=0;i<wind;i++){
            hash2[s.charAt(i)-'a']++;
        }
        if(Arrays.equals(hash1, hash2)){
            ans.add(0);
        }
        for(int right=wind;right<s.length();right++){
            hash2[s.charAt(right)-'a']++;
            int left=right-wind;
            hash2[s.charAt(left)-'a']--;
            if(Arrays.equals(hash1, hash2)){
                ans.add(left+1);
            }
        }
        return ans;
    }
}
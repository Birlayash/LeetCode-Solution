class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()){
            return false;
        }
        int[] hash1=new int[26];
        int[] hash2=new int[26];
        for(int i=0;i<s1.length();i++){
            hash1[s1.charAt(i)-'a']++;
        }
        int wind=s1.length();
        for(int i=0;i<wind;i++){
            hash2[s2.charAt(i)-'a']++;
        }
        if(Arrays.equals(hash1, hash2)){
            return true;
        }
        for(int right=wind;right<s2.length();right++){
            hash2[s2.charAt(right)-'a']++;
            int left=right-wind;
            hash2[s2.charAt(left)-'a']--;
            if(Arrays.equals(hash1, hash2)){
                return true;
            }
        }
        return false;
    }
}
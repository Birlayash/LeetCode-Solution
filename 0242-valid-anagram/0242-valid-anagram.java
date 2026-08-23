class Solution {
    public boolean isAnagram(String s, String t) {
        int[] hash1= new int[26];
        int[] hash2= new int[26];
        if (s.length() != t.length()) {
            return false;
        }
        for(int i=0;i<s.length();i++){
            hash1[s.charAt(i)-'a']+=1;
            hash2[t.charAt(i)-'a']+=1;
        }
        for(int i=0;i<26;i++){
            if(hash1[i]!=hash2[i]){
                return false;
            }
        }
        return true;
    }
}
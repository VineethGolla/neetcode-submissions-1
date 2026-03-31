class Solution {
    public boolean isAnagram(String s, String t) {
        int ans[]=new int[26];
        int j=0;
        if(s.length() != t.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            ans[s.charAt(i)-'a']++;
            // System.out.print(ans[j]+" ");
            // j++;
        }
        // j=0;
        // System.out.println();
        for(int i=0;i<t.length();i++){
            ans[t.charAt(i)-'a']--;
            // System.out.print(ans[j]+" ");
            // j++;
        }
        for(int i=0;i<26;i++){
            if(ans[i] != 0){
                return false;
            }
        }
        return true;
    }
}

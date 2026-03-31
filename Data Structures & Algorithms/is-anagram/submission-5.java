class Solution {
    public boolean isAnagram(String s, String t) {
        int ans[]=new int[26];
        for(int i=0;i<s.length();i++){
            int ch=s.charAt(i)-'a';
            ans[ch]++;
        }

        for(int i=0;i<t.length();i++){
            int ch=t.charAt(i)-'a';
            ans[ch]--;
        }
        for(int i=0;i<26;i++){
            if(ans[i]!=0){
                return false;
            }
        }
        return true;
    }
}

class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb= new StringBuilder(); 
        int l1=0;
        int r1=word1.length();
        int l2=0;
        int r2=word2.length();
        while(l1<r1 && l2<r2){
            sb.append(word1.charAt(l1));
            sb.append(word2.charAt(l2));
            l1++;
            l2++;
        }

        while(l1<r1){
            sb.append(word1.charAt(l1));
            l1++;
        }
        while(l2<r2){
            sb.append(word2.charAt(l2));
            l2++;
        }
        return sb.toString();
    }
}
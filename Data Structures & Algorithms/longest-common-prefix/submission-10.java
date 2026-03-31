class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb= new StringBuilder();
        int i=0;
        if(strs[0].length()==0){
            return sb.toString();
        }
        while(i<strs[0].length()){
            for(int j=1;j<strs.length;j++){
                if(i>=strs[j].length()  || strs[0].charAt(i) != strs[j].charAt(i)){
                    return sb.toString();
                }
            }
            sb.append(strs[0].charAt(i));
            i++;
        }
        return sb.toString();
    }
}
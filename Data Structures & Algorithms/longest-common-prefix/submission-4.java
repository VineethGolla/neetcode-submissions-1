class Solution {
    public String longestCommonPrefix(String[] strs) {
        int i=0;
        StringBuilder sb = new StringBuilder();
        // if(strs.length==1){
        //     return strs[0];
        // }
        while(i<strs[0].length()){
            char ch=strs[0].charAt(i);
            for(int j=1;j<strs.length;j++){
                if(i>=strs[j].length() || strs[j].charAt(i) != ch){
                    
                    return sb.toString();
                }
            }
            sb.append(ch);
            i++;
        }
        return sb.toString();
    }
}
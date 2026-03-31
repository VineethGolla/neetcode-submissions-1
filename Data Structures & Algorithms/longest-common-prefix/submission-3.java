class Solution {
    public String longestCommonPrefix(String[] strs) {
        int i=0;
        StringBuilder sb = new StringBuilder();
        int y=0;
        if(strs.length==1){
            return strs[0];
        }
        while(i<strs[0].length()){
            char ch=strs[0].charAt(i);
            for(int j=1;j<strs.length;j++){
                if(y==-1){
                    break;
                }
                if(i<strs[j].length() && strs[j].charAt(i) == ch){
                    if(j==strs.length-1){
                        sb.append(ch);
                    }
                    continue;
                }else{
                    y=-1;
                    break;
                }
            }
            i++;
        }
        return sb.toString();
    }
}
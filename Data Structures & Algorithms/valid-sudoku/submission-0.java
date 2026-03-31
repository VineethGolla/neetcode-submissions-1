class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> set = new HashSet<>();
        String key="";
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                char ch=board[i][j];
                if(ch=='.'){
                    continue;
                }
                key=ch+ "Row" + i;
                if(set.contains(key)){
                    return false;
                }
                set.add(key);

                key=ch+ "column" +j;
                if(set.contains(key)){
                    return false;
                }
                set.add(key);

                key=ch+ "box" + i/3 + "-"+ j/3;
                if(set.contains(key)){
                    return false;
                }
                set.add(key);
            }
        }
        return true;
    }
}

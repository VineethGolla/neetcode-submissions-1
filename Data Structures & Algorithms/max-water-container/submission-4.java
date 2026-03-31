class Solution {
    public int maxArea(int[] heights) {
        int i=0;
        int j=heights.length-1;
        int max=0;
        int res=0;
        while(i<j){
            max=Math.min(heights[i],heights[j])*(j-i);
            if(heights[i]>heights[j]){
                j--;
            }else{
                i++;
            }
            res=Math.max(res,max);
        }
        return res;
    }
}

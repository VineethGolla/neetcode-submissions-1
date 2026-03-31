class Solution {
    public int maxArea(int[] heights) {
        int i=0;
        int j=heights.length-1;
        int min=heights[0];
        int ans=0;
        while(i<j){
            if(heights[i]<heights[j]){
                min=heights[i]*(j-i);
                i++;
            }else{
                min=heights[j]*(j-i);
                j--;
            }
            ans=Math.max(ans,min);
        }
        return ans;
    }
}

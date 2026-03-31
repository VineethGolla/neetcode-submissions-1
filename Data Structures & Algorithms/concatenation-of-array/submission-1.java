class Solution {
    public int[] getConcatenation(int[] nums) {
        int ans[]=new int[2*nums.length];
        int k=0;
        for(int n=0;n<2;n++){
            for(int i=0;i<nums.length;i++){
                ans[k]=nums[i];
                k++;
            }
        }
        return ans;
    }
}
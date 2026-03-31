class Solution {
    public int[] productExceptSelf(int[] nums) {
        int ans[]=new int[nums.length];
        // ans[0]=nums[0];
        int prefix=1;
        for(int i=0;i<nums.length;i++){
            ans[i]=prefix;
            prefix=prefix*nums[i];
        }
        int suffix=nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
            ans[i]=ans[i]*suffix;
            suffix=suffix*nums[i];
        }
        return ans;
    }
}  

class Solution {
    public int firstMissingPositive(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                nums[i]=0;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(Math.abs(nums[i])>nums.length){
                continue;
            }
            if(nums[i]==0){
                nums[i]=(nums.length+1);
            }
            else if(Math.abs(nums[i]) != 0){
                int val=Math.abs(nums[i]);
                nums[val-1]=-Math.abs(nums[val-1]);
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                return i+1;
            }
        }
        return (nums.length+1);
    }
}
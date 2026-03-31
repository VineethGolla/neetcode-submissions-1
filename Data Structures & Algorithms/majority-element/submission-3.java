class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int i=0;
        int count=0;
        int ans=nums[0];
        while(i<nums.length){
            if(nums[i]==ans){
                count++;
            }
            else{
                count--;
            }
            i++;
            if(count==0){
                ans=nums[i];
            }
        }
        return ans;
    }
}
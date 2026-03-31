class Solution {
    public int majorityElement(int[] nums) {
        int ans=nums[0];
        int count=0;
        int i=0;
        while(i<nums.length){
            if(count==0){
                ans=nums[i];
            }
            if(ans==nums[i]){
                count++;
            }else{
                count--;
            }
            i++;
        }
        return ans;
    }
}
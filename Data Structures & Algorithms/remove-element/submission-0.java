class Solution {
    public int removeElement(int[] nums, int val) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                count++;
            }
        }
        int x=0;
        int i=0;
        while(i<nums.length){
            if(nums[i]!=val){
                nums[x]=nums[i];
                x++;
            }
            i++;
        }
        return count;
    }
}
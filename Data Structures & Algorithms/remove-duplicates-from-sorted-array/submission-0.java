class Solution {
    public int removeDuplicates(int[] nums) {
        int count=1;
        int i=0;
        int j=1;
        int n=nums.length;
        while(i<n && j<n){
            while(j<n && nums[i]==nums[j]){
                j++;
            }
            if(i<n-1 && j<n && nums[i]!=nums[j]){
                nums[i+1]=nums[j];
                i++;
                j++;
                count++;
            }else{
                break;
            }
        }
        return count;
    }
}
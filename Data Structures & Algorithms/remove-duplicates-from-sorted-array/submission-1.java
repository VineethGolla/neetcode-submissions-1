class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        int n=nums.length;
        for(int j=1;j<n;j++){
            if(nums[i]!=nums[j]){
                i++;
                nums[i]=nums[j];
            }
        }
        // while(i<n && j<n){
        //     while(j<n && nums[i]==nums[j]){
        //         j++;
        //     }
        //     if(i<n-1 && j<n && nums[i]!=nums[j]){
        //         nums[i+1]=nums[j];
        //         i++;
        //         j++;
        //     }else{
        //         break;
        //     }
        // }
        return i+1;
    }
}
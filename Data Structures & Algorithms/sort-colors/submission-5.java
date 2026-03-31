class Solution {
    public void sortColors(int[] nums) {
        int i=0;
        int j=nums.length-1;
        int m=0;
        while(m<=j){
            if(nums[m]==0){
                int temp=nums[i];
                nums[i]=nums[m];
                nums[m]=temp;
                m++;
                i++;
            }
            else if(nums[m]==2){
                int temp=nums[j];
                nums[j]=nums[m];
                nums[m]=temp;
                j--;
            }
            else if(nums[m]==1){
                m++;
            }
        }
    }
}
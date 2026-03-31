class Solution {
    public void rotate(int[] nums, int k) {
        int x=k%nums.length;
        sort(nums,0,nums.length-1);
        sort(nums,0,x-1);
        sort(nums,x,nums.length-1);

    }
    public void sort(int[] nums,int i , int j){
        while(i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
    }
}
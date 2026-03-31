class Solution {
    public void sortColors(int[] nums) {
        int count=0;
        int count1=0;
        int count2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                count++;
            }
            if(nums[i]==1){
                count1++;
            }
            if(nums[i]==2){
                count2++;
            }
        }
        int x=0;
        while(x<count){
            nums[x]=0;
            x++;
        }
        x=0;
        while(x<count1){
            nums[x+count]=1;
            x++;
        }
        x=0;
        while(x<count2){
            nums[x+count+count1]=2;
            x++;
        }
    }
}
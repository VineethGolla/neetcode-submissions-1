class Solution {
    public int[] sortArray(int[] nums) {
        sort(nums,0,nums.length-1);
        return nums;
    }
    public void sort(int[] A,int i,int j){
        if(i>=j){
            return;
        }
        int m=(i+j)/2;
        sort(A,i,m);
        sort(A,m+1,j);
        merge(A,i,m,j);
    }

    public void merge(int[] nums, int x,int m,int y){
        int k=0;
        int p=m+1;
        int i=x;
        int j=y;
        int A[]=new int[j-i+1];
        while(i<=m && p<=j){
            if(nums[i]>nums[p]){
                A[k]=nums[p];
                p++;
                k++;
            }
            else if(nums[i]<=nums[p]){
                A[k]=nums[i];
                i++;
                k++;
            }
        }
        while(i<=m){
            A[k]=nums[i];
            i++;
            k++;
        }
        while(p<=j){
            A[k]=nums[p];
            p++;
            k++;
        }
        for(int q=0;q<A.length;q++){
            nums[x+q]=A[q];
        }
    }
}
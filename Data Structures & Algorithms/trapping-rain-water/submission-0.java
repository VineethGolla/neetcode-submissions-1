class Solution {
    public int trap(int[] height) {
        int pfmax=height[0];
        int sfmax=height[height.length-1];

        int sum=0;
        int i=0;
        int j=height.length-1;
        while(i<j){
            int x=0;
            if(pfmax<=sfmax){
                i++;
                x=Math.min(pfmax,sfmax)-height[i];
                if(pfmax<height[i]){
                    pfmax=height[i];
                }
            }
            else{
                j--;
                x=Math.min(pfmax,sfmax)-height[j];
                if(sfmax<height[j]){
                    sfmax=height[j];
                }
            }
            if(x>0){
                sum+=x;
            }
        }
        return sum;
    }
}

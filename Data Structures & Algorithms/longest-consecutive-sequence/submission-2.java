class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        if(nums.length==0){
            return 0;
        }
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }

        int length=0;
        int curr=0;
        int max=0;
        for(int x : set){
            curr=x;
            length=1;
            if(set.contains(x-1)){
                continue;
            }
            else{
                while(set.contains(x+1)){
                    x++;
                    length++;
                }
            }
            max=Math.max(length,max);
        }
        return max;
    }
}

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int ans[]=new int[2];
        HashMap<Integer,Integer> map= new HashMap<>();
        map.put(numbers[0],0);
        for(int i=0;i<numbers.length;i++){
            if(map.containsKey(target-numbers[i])){
                int l=map.get(target-numbers[i]);
                return new int[]{l+1,i+1};

            }
            map.put(numbers[i],i);
        }
        return null;
    }
}

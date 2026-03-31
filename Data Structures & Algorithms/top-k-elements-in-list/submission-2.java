class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        ArrayList<ArrayList<Integer>> x=new ArrayList<>();
        for(int i=0;i<=nums.length;i++){
            x.add(new ArrayList<>());
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            int key=entry.getKey();
            int value=entry.getValue();
            x.get(value).add(key);
        }
        int ans[]=new int[k];
        int count=k-1;
        for(int i=x.size()-1;i>=0 && count>=0;i--){
            for(int j=0;j<x.get(i).size() && count>=0;j++){
                ans[count]=x.get(i).get(j);
                count--;
            }
        }
        return ans;
    }
}

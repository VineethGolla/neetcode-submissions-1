class Solution {
    public int[] topKFrequent(int[] nums, int k) {
         HashMap<Integer, Integer> map=new HashMap<>();
         for(int i=0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
         }

        ArrayList<ArrayList<Integer>> x=new ArrayList<>();
        for(int i=0;i<=nums.length;i++){
            x.add(new ArrayList<>());
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            int key=entry.getKey();
            int value=entry.getValue();
            x.get(value).add(key);
        }

        int ans[]=new int[k];
        int i=x.size()-1;
        int count=0;
        while(i>=0 && count<k){
            for(int j=0;j<x.get(i).size();j++){
                if(x.get(i).size()>0){
                    ans[count]=x.get(i).get(j);
                    count++;
                }
            }
            i--;
        }
        return ans;
    }
} 
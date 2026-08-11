class Solution {
    public List<List<Integer>> subsets(int[] nums) {

        List<Integer> ans = new ArrayList<>();
        List<List<Integer>> list = new ArrayList<>();
        subset(ans , nums , 0 , list);
        return list;
        
    }

    private static  void subset(List<Integer> ans ,int[] nums ,int i  ,List<List<Integer>> list)
    {
        if(i == nums.length)
        {
            list.add(ans);
            return;
        }

        subset(ans , nums , i + 1, list);

        List<Integer> newAns = new ArrayList<>(ans);
	    newAns.add(nums[i]);

        subset(newAns,nums, i+1, list);
    }
}
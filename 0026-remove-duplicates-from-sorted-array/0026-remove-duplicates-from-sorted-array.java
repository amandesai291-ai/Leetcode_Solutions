class Solution 
{
    public boolean helper(int num , ArrayList<Integer> list)
    {
        for(int i = 0; i < list.size(); i++)
        {
            if(num == list.get(i)) return false;
        }
        return true;
    }
    public int removeDuplicates(int[] nums) 
    {
        if(nums.length == 0) return 0;
        ArrayList<Integer> list = new ArrayList<>();

        list.add(nums[0]);

        for(int i = 1; i < nums.length; i++)
        {
            if(helper(nums[i] , list)) list.add(nums[i]);
        }

        for(int i = 0; i < list.size(); i++)
        {
            nums[i] = list.get(i);
        }

        return list.size();
    }
}
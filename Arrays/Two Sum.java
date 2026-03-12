class Solution 
{
    public int[] twoSum(int[] nums, int target) 
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
        int previous=target-nums[i];
        if(map.containsKey(previous))
        {
            return new int[]{map.get(previous),i};
        }
        map.put(nums[i],i);
    }
    return new int[]{};
    }
}

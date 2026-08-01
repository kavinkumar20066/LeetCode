class Solution {
    public boolean canJump(int[] nums) {
        int max=0;
        for(int i=0;i<nums.length;i++)
        {
            if(i>max && i!=0)
            {
                return false;
            }
            int sum=0;
            sum=i+nums[i];
            max=Math.max(sum,max);
        }
        return true;
    }
}

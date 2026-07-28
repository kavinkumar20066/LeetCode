class Solution {
    public int firstMissingPositive(int[] nums) {
        boolean[] ans = new boolean[nums.length+1];
        for(int i : nums){
            if(i >=0 && i<=nums.length){
            ans[i] = true; 
            }
        }
        for(int m = 1;m<ans.length;m++){
            if(!ans[m]) {
                return m;
            }
        }
        return nums.length+1;
    }
}

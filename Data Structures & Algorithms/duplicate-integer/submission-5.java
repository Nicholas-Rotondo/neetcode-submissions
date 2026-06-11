class Solution {
    public boolean hasDuplicate(int[] nums) {
        Arrays.sort( nums );
        if(nums.length == 0 || nums.length == 1) {
            return false;
        }
        if(nums.length < 3) {
            if(nums[0] == nums[1]) {
                return true;
            }
        }
        for(int i = 1; i < nums.length-1; i++) {
            if(nums[i] == nums[i-1] || nums[i] == nums[i+1]) {
                return true;
            }
        }
        return false;
    }
}

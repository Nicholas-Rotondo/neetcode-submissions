class Solution {
    public int search(int[] nums, int target) {
        if(nums == null || nums.length == 0) {
            return -1;
        }
        else if(nums.length == 1) {
            return nums[0] == target ? 0 : -1;
        }
        else {
            return helper(nums, 0, nums.length-1, target);
        }

    }

    public int helper(int[] nums, int beg, int end, int target) {
        if(nums[end] < target) {
            return -1;
        }
        else if(nums[beg] < target) {
            System.out.println("beg +1 is: " + (beg+1));
            return helper(nums, beg+1, end, target);
        }
        else if(nums[beg] > target) {
            return -1;
        }
        else if(nums[end] > target) {
            System.out.println("end -1 is: " + (end-1));
            return helper(nums, beg, end-1, target);
        }
        else if(nums[beg] == target) {
            return beg;
        }
        else if(nums[end] == target) {
            return end;
        }
        else {
            return -1;
        }
    }
}

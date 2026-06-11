class Solution {
    public int search(int[] nums, int target) {
        return binaryRotatedSearch(0, nums.length-1, nums, target);
    }

    public int binaryRotatedSearch(int left, int right, int[] nums, int target) {

        // base case, left has been incremented past right
        if(left > right) {
            return -1;
        }

        int mid = left + (right - left) / 2;

        if(nums[mid] == target) {
            return mid;
        }

        if(nums[mid] >= nums[left]) {
            if(target >= nums[left] && target < nums[mid]) {
                return binaryRotatedSearch(left, mid-1, nums, target);
            } else {
                return binaryRotatedSearch(mid+1, right, nums, target);
            }
        } else {
            if(target > nums[mid] && target <= nums[right]) {
                return binaryRotatedSearch(mid+1, right, nums, target);
            } else {
                return binaryRotatedSearch(left, mid-1, nums, target);
            }
        }
    }
}

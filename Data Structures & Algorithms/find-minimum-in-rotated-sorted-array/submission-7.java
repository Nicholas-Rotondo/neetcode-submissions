class Solution {
    public int findMin(int[] nums) {
        return binarySearch(nums, 0, nums.length - 1);
    }

    private int binarySearch(int[] nums, int left, int right) {
        // Base case: narrowed down to one element
        if (left == right) {
            return nums[left];
        }

        // If this section is already sorted, minimum is at left
        if (nums[left] < nums[right]) {
            return nums[left];
        }

        int mid = left + (right - left) / 2;

        // Minimum is in the unsorted half
        if (nums[mid] >= nums[left]) {
            // Left half is sorted, so min must be in right half
            return binarySearch(nums, mid + 1, right);
        } else {
            // Right half is sorted, so min is in left half (including mid)
            return binarySearch(nums, left, mid);
        }
    }
}
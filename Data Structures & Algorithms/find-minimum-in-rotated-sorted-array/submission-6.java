class Solution {
    public int findMin(int[] nums) {
        if(nums.length == 0) {
            return -1;
        }
        
        return binaryRotatedSearch(0, nums.length-1, nums);
    }

    public int binaryRotatedSearch(int left, int right, int[] nums) {
        


        if(nums.length <= 2 && nums[left] < nums[right]) {
            return binaryRotatedSearch(left, right-1, nums);
        }

        int mid = left + (right-left) / 2; 

        if(nums[left] < nums[right]) {
            return binaryRotatedSearch(left, right-1, nums);
        }
        else if(nums[right] < nums[left] && nums[right] < nums[mid]) {
            return binaryRotatedSearch(mid+1, right, nums);
        } else if (nums[right] < nums[left] && nums[right] > nums[mid]) {
            return binaryRotatedSearch(left, mid, nums);
        }

        return nums[mid];
    }
}

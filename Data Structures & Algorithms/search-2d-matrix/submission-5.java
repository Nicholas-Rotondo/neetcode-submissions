class Solution {
    public static boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0) {
            return false;
        }
        int leftRow = 0;
        int rightRow = matrix.length-1;

        return twoDimBinarySearch(leftRow, rightRow, matrix, target);
    }

    public static boolean twoDimBinarySearch(int leftRow, int rightRow, int[][] matrix, int target) {
        int mid = leftRow + (rightRow - leftRow) / 2;
        int lastCol = matrix[mid].length - 1;

        if(leftRow > rightRow) {
            return false;
        }

        // We are in the array that possibly has our target
        if(leftRow == rightRow) {
            int row = 0;
            int col = matrix[mid].length-1;
            return binarySearch(row, lastCol, matrix[mid], target);
        }

        if (matrix[mid][lastCol] < target) {
            return twoDimBinarySearch(mid + 1, rightRow, matrix, target);
        } else {
            return twoDimBinarySearch(leftRow, mid, matrix, target);  // mid, not mid-1
        }
    }

    public static boolean binarySearch(int l, int r, int[] nums, int target) {
        if (l > r) return false;
        int m = l + (r - l) / 2;

        if (nums[m] == target) return true;
        return (nums[m] < target) ?
            binarySearch(m + 1, r, nums, target) :
            binarySearch(l, m - 1, nums, target);
    }
}

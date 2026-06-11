class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int begIndex = 0;
        int endIndex = numbers.length-1;
        int sum = 0;
        int[] res = new int[2];
        while (begIndex <= endIndex){
            sum = numbers[begIndex] + numbers[endIndex];
            if (sum == target){
                res[0] = begIndex +  1;
                res[1] = endIndex + 1;
                return res;
            }
            if(sum < target) {
                begIndex += 1;
            }
            else if(sum > target) {
                endIndex -= 1;
            }
        }
        return res;
    }
}

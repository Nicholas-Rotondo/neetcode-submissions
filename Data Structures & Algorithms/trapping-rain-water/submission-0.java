class Solution {
    public static int trap(int[] height) {
        int sum = 0;
        int left = 0;
        int leftTower = height[left];
        int right = height.length-1;
        int rightTower = height[right];

        // left and right are never moving.
        while (left < right) {

            if(leftTower < rightTower) {
                left++;
                leftTower = Math.max(leftTower, height[left]);
                sum += leftTower - height[left];                
            }
            else {
                right--;
                rightTower = Math.max(rightTower, height[right]);
                sum += rightTower - height[right];                
            }
            
        }
        
        System.out.println("sum is: " + sum);
        return sum;
    }

}

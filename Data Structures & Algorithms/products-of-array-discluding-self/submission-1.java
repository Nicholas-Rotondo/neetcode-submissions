class Solution {
    public int[] productExceptSelf(int[] nums) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        int[] res = new int[nums.length];
        int sum = 1;
        for (int i = 0; i < nums.length; i++) {
            hashMap.putIfAbsent(nums[i], multiplyValues(nums, i));
        }

        for(Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            for(int i = 0; i < nums.length; i++) {
                if(entry.getKey() == nums[i]) {
                    res[i] = entry.getValue();
                }
            }
        }

        //System.out.println(hashMap);
        return res;
    }

    public int multiplyValues(int[] nums, int index) {
        int sum = 1;
        for (int i = 0; i < nums.length; i++) {
            if(i != index){
                sum *= nums[i];
            }
        }
        return sum;
    }
}  

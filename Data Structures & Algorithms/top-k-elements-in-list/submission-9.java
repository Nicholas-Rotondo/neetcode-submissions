class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Key is the number and value is the freq
        HashMap<Integer, Integer> mapp = new HashMap<>();
        int count = 0;
        List<Integer> toList = new ArrayList<>();
        Map<Integer, Integer> sortedMap = new LinkedHashMap<>();

        for(int num : nums) {
            if(mapp.containsKey(num)) {
                int tempValue = mapp.get(num);
                int tempCount = tempValue+=1;
                mapp.put(num, tempCount);
            } else {
                mapp.putIfAbsent(num, count+=1);
            }
            count = 0;
        }

        mapp.entrySet()
            .stream()
            .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
            .forEach(e -> sortedMap.put(e.getKey(), e.getValue()));
        System.out.println("mapp is: " + mapp);

        for(Map.Entry<Integer, Integer> entry : sortedMap.entrySet()) {
            if(toList.size() == k) {
                break;
            } 
            toList.add(entry.getKey());
        }

        int[] res = new int[toList.size()];
        for(int i = 0; i < toList.size(); i++) {
            res[i] = toList.get(i);
        }

        return res;
    }
}

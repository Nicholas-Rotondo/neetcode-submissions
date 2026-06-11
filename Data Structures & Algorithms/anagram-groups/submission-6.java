class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> mapp = new HashMap<>();
        List<List<String>> res = new ArrayList<>();

        if (strs.length == 0) return res;

        String start = strs[0];
        String sorted = sortAndCheckHelper(start);

        List<String> value = new ArrayList<>();
        value.add(start);                 
        mapp.put(sorted, value);          

        if (strs.length == 1) {
            res.add(value);
            return res;
        }

        for (int i = 1; i < strs.length; i++) {
            String original = strs[i];
            String sortedKey = sortAndCheckHelper(original);

            if (mapp.containsKey(sortedKey)) {
                
                mapp.get(sortedKey).add(original);
            } else {
                List<String> tempList = new ArrayList<>();
                tempList.add(original);
                mapp.put(sortedKey, tempList);
            }
        }

        for (Map.Entry<String, List<String>> entry : mapp.entrySet()) {
            res.add(entry.getValue());
        }

        return res;
    }

    public String sortAndCheckHelper(String input) {
        char[] arr = input.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
}

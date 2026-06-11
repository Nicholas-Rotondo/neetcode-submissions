class Solution {
    public boolean isAnagram(String s, String t) {
        char[] ss = s.toCharArray();
        char[] tt = t.toCharArray();
        Arrays.sort(ss);
        Arrays.sort(tt);
        String sorted_s = String.valueOf(ss);
        String sorted_t = String.valueOf(tt);
        if(sorted_s.equals(sorted_t)) {
            return true;
        }
        return false;
    }
}

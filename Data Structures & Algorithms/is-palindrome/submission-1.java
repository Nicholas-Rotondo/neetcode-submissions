class Solution {
    public boolean isPalindrome(String s) {
        String newString = removeNonAlphanumeric(s).toLowerCase();
        int begLen = 0;
        int endLen = newString.length()-1;
        System.out.println(newString);
        while (begLen <= endLen) {
            if(newString.charAt(begLen) == newString.charAt(endLen)) {
                begLen += 1;
                endLen -= 1;
            }
            else {
                return false;
            } 
        }
        return true;
    }

        public static String removeNonAlphanumeric(String str) {
        // replace the given string
        // with empty string
        // except the pattern "[^a-zA-Z0-9]"
        str = str.replaceAll(
          "[^a-zA-Z0-9]", "");

        // return string
        return str;
    }
}

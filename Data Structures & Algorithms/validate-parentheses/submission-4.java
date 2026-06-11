class Solution {
    public boolean isValid(String s) {
        Stack<Character> res = new Stack<Character>();

        for(int i = 0; i < s.length(); i++) {

            if(s.charAt(i) == '[' || s.charAt(i) == '(' || s.charAt(i) == '{') {
                res.push(s.charAt(i));
                continue;
            } else {
                if(res.empty()) {
                    return false;
                }
                char tempElem = res.pop();

                if(tempElem != '[' && s.charAt(i) == ']' 
                || tempElem != '{' && s.charAt(i) == '}' 
                || tempElem != '(' && s.charAt(i) == ')') {
                    return false;
                }
            }
        }

        return res.empty();
    }
}

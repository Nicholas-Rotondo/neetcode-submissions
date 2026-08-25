class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False

        sorted_text_t = "".join(sorted(t))
        sorted_text_s = "".join(sorted(s))
         
        if sorted_text_t == sorted_text_s:
            return True
        
        return False



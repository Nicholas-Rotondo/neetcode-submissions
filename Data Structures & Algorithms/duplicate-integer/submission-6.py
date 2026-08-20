class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        dup_set = set()
        for num in nums:
            if num not in dup_set:
                dup_set.add(num)
            else:
                return True
        return False

        
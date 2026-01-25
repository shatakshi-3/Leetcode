class Solution:
    def firstUniqChar(self, s: str) -> int:
        unique={}
        for char in s:
            unique[char]=unique.get(char,0)+1
        for i ,char in enumerate(s):
            if unique[char]==1:
                return i
        return -1

        
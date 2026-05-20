class Solution(object):
    def checkString(self, s):
        """
        :type s: str
        :rtype: bool
        """
        sb='ba'
        for i in s:
            if sb in s:
                return False
        return True
        
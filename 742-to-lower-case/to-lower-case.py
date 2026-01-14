class Solution:
    def toLowerCase(self, s: str) -> str:
        result=[]
        for i in s:
            if 'A'<= i <= 'Z':
                result.append(chr(ord(i)+32))
            else:
                result.append(i)
        return ''.join(result)
        
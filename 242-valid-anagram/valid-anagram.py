class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        s=s.replace(" ","").lower()
        t=t.replace(" ","").lower()
        if len(s)!=len(t):
            return False
        count={}

        for i in s:
            if i in count:
                count[i]+=1
            else:
                count[i]=1

        for i in t:
            if i in count:
                count[i]-=1
                if count[i]<0:
                    return False
            else:
                return False
        return True

        
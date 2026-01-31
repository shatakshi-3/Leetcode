from typing import List

class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        if not strs:
            return ""
        
        # Start by assuming the whole first string is the common prefix
        prefix = strs[0]
        
        # Compare the prefix with each string in the list
        for s in strs[1:]:
            # Reduce the prefix until it matches the start of the string
            while not s.startswith(prefix):
                prefix = prefix[:-1]  # Remove the last character
                if not prefix:  # If prefix becomes empty
                    return ""
        
        return prefix

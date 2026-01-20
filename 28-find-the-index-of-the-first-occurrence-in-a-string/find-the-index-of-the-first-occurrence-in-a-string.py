class Solution:
    def strStr(self, haystack: str, needle: str) -> int:
        # If needle is an empty string, return 0
        if not needle:
            return 0
        
        # Get the lengths of haystack and needle
        haystack_length = len(haystack)
        needle_length = len(needle)
        
        # If needle is longer than haystack, return -1
        if needle_length > haystack_length:
            return -1
        
        # Iterate through haystack
        for i in range(haystack_length - needle_length + 1):
            # Check if the substring from haystack matches needle
            if haystack[i:i + needle_length] == needle:
                return i
        
        # If no match found, return -1
        return -1

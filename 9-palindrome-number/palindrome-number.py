class Solution:
    def isPalindrome(self, x: int) -> bool:
        # Negative numbers are not palindromes
        if x < 0:
            return False
        # Convert the integer to a string
        str_x = str(x)
        # Check if the string is the same forwards and backwards
        return str_x == str_x[::-1]

        
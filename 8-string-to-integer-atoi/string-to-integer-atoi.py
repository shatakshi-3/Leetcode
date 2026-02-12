class Solution:
    def myAtoi(self, s: str) -> int:
        # Define the limits for 32-bit signed integer
        INT_MAX = 2**31 - 1
        INT_MIN = -2**31
        
        # Initialize variables
        i = 0
        n = len(s)
        sign = 1
        num = 0
        
        # Step 1: Ignore leading whitespace
        while i < n and s[i] == ' ':
            i += 1
        
        # Step 2: Check for sign
        if i < n and (s[i] == '-' or s[i] == '+'):
            sign = -1 if s[i] == '-' else 1
            i += 1
        
        # Step 3: Convert the digits
        while i < n and s[i].isdigit():
            digit = int(s[i])
            # Check for overflow/underflow
            if num > (INT_MAX - digit) // 10:
                return INT_MIN if sign == -1 else INT_MAX
            
            num = num * 10 + digit
            i += 1
        
        return sign * num

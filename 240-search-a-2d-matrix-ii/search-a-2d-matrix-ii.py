class Solution:
    def searchMatrix(self, matrix, target):
        if not matrix or not matrix[0]:
            return False
        
        m, n = len(matrix), len(matrix[0])
        row, col = 0, n - 1  # Start from the top-right corner

        while row < m and col >= 0:
            value = matrix[row][col]
            if value == target:
                return True
            elif value > target:
                col -= 1  # Move left
            else:
                row += 1  # Move down

        return False

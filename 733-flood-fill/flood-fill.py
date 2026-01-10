from typing import List

class Solution:
    def floodFill(self, image: List[List[int]], sr: int, sc: int, color: int) -> List[List[int]]:
        n, m = len(image), len(image[0])
        original_color = image[sr][sc]

        if original_color == color:
            return image

        def dfs(r: int, c: int):
            # Check if the current position is out of bounds or not the original color
            if r < 0 or r >= n or c < 0 or c >= m or image[r][c] != original_color:
                return
            
            # Change the color of the current pixel
            image[r][c] = color
            
            # Recursively call dfs for the four adjacent pixels
            dfs(r + 1, c)  # down
            dfs(r - 1, c)  # up
            dfs(r, c + 1)  # right
            dfs(r, c - 1)  # left

        # Start the flood fill from the given starting pixel
        dfs(sr, sc)
        return image

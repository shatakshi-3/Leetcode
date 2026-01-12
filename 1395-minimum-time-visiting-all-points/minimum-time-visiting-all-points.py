class Solution:
    def minTimeToVisitAllPoints(self, points):
        total_time = 0
    
        for i in range(1, len(points)):
            x1, y1 = points[i - 1]
            x2, y2 = points[i]
            
            # Calculate the time to move from point[i-1] to point[i]
            time = max(abs(x2 - x1), abs(y2 - y1))
            total_time += time
        
        return total_time
        
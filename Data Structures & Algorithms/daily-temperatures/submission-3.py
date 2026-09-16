class Solution:
    def dailyTemperatures(self, temperatures: List[int]) -> List[int]:
        n = len(temperatures)
        answer = [0] * n  # Initialize the answer array with 0
        stack = []  # Monotonic decreasing stack to store indices
        
        for i in range(n):
            # Check for indices in the stack where the current temperature is warmer
            while stack and temperatures[i] > temperatures[stack[-1]]:
                prev_index = stack.pop()  # Get the index of the previous day
                answer[prev_index] = i - prev_index  # Calculate the days difference
            
            # Push the current day's index onto the stack
            stack.append(i)
        
        return answer
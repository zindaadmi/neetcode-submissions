class Solution:
    def generateParenthesis(self, n: int) -> List[str]:
        result = []

        def backtrack(current: str, open_count: int, close_count: int):
            # Base case: If the current string is valid and has length 2*n
            if len(current) == 2 * n:
                result.append(current)
                return
            
            # Add an opening parenthesis if we have not used all of them
            if open_count < n:
                backtrack(current + "(", open_count + 1, close_count)
            
            # Add a closing parenthesis if it does not exceed the number of open ones
            if close_count < open_count:
                backtrack(current + ")", open_count, close_count + 1)
        
        # Start the backtracking process
        backtrack("", 0, 0)
        return result


                
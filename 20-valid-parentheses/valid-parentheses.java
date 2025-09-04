class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } 
            
            else if (ch == ')' || ch == '}' || ch == ']') {
                
                if (stack.isEmpty()) {
                    return false;
                }
                
                char top = stack.pop();
                if (!isMatchingPair(top, ch)) {
                    return false;
                }
            }
        }

        // If the stack is empty, all parentheses are balanced
        return stack.isEmpty();
    }

    private boolean isMatchingPair(char opening, char closing) {
        return (opening == '(' && closing == ')') ||
               (opening == '{' && closing == '}') ||
               (opening == '[' && closing == ']');
    }
    
}
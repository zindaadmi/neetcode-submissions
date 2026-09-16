class Solution {
    public boolean isValid(String s) {
        Stack<Character> brac = new Stack<>();
        for(char ch: s.toCharArray())
        {
            if(ch == '{'){
                brac.push('}');
            }
            else if(ch == '['){
             brac.push(']');
            }
             else if(ch == '('){
                brac.push(')');
             }
             else{
                if(brac.isEmpty() || brac.pop()!=ch){
                    return false;
                }
             }
        }
        return brac.isEmpty();
    }
}

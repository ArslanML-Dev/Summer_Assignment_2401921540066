class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<Character>(); //create stack

        if (s == null || s.length() == 0) {
            return true;
        } else {

            for (int i = 0; i < s.length(); i++) {

                if (s.charAt(i) == ')') {
                    if (!stk.isEmpty() && stk.peek() == '(') {
                        stk.pop();
                    } else {
                        return false;
                    }
                }

                else if (s.charAt(i) == ']') {
                    if (!stk.isEmpty() && stk.peek() == '[') {
                        stk.pop();
                    } else {
                        return false;
                    }
                }

                else if (s.charAt(i) == '}') {
                    if (!stk.isEmpty() && stk.peek() == '{') {
                        stk.pop();
                    } else {
                        return false;
                    }
                }

                else {
                    stk.push(s.charAt(i)); //push in stack
                }

            } // for

        } // else

        if (stk.isEmpty())
            return true;
        else
            return false;

    } // method
} // class

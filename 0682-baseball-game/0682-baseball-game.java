import java.util.*;

class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();
        
        for (String op : ops) {
            if (op.equals("+")) {
                int top = stack.pop();
                int newTop = top + stack.peek();
                stack.push(top);       // push back previous
                stack.push(newTop);    // push new score
            } 
            else if (op.equals("D")) {
                stack.push(2 * stack.peek());
            } 
            else if (op.equals("C")) {
                stack.pop();
            } 
            else {
                stack.push(Integer.parseInt(op));
            }
        }
        
        int sum = 0;
        for (int score : stack) {
            sum += score;
        }
        
        return sum;
    }
}
//Approach 
/* Use a stack to store scores:
When you see a number → push it
"+" → pop top, peek next, compute sum, push both back properly
"D" → push 2 × top
"C" → pop*/

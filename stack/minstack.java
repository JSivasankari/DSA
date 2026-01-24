import java.util.*;

class MinStack {
    int min = Integer.MAX_VALUE;
    Stack<Integer> stack = new Stack<>();
    
    public void push(int val) {
        if (val <= min) {
            stack.push(min);
            min = val;
        }
        stack.push(val);
    }
    
    public void pop() {
        if (stack.pop() == min) {
            min = stack.pop();
        }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return min;
    }
}

public class minstack {
    public static void main(String[] args) {
        MinStack obj = new MinStack();

        obj.push(5);
        obj.push(3);
        obj.push(7);
        obj.push(2);

        System.out.println("Top: " + obj.top());      
        System.out.println("Min: " + obj.getMin());   

        obj.pop(); 

        System.out.println("Top after pop: " + obj.top());    
        System.out.println("Min after pop: " + obj.getMin()); 
    }
}

import java.util.*;
class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s=new Stack<>();
        for(String c: tokens){
            if(c.equals("+")){
                s.push(s.pop()+s.pop());
            }
            
            else if(c.equals("-")){
                int second=s.pop();
                int first=s.pop();
                s.push(first-second);
                
            }else if(c.equals("*")){
                s.push(s.pop()*s.pop());
            }else if(c.equals("/")){
                int second=s.pop();
                int first=s.pop();
                s.push(first/second);
            }else{
                s.push(Integer.parseInt(c));
            }
        }
        return s.peek();
        
    }
    public static void main(String[] args) {
    Solution obj = new Solution();

    String[] tokens = {"2", "1", "+", "3", "*"};  
    System.out.println(obj.evalRPN(tokens));

    String[] tokens2 = {"4", "13", "5", "/", "+"}; 
    System.out.println(obj.evalRPN(tokens2));
}

    
}
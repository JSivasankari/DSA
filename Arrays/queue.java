import java.util.*;
class stackusingqueue{
    Queue<Integer> q1=new LinkedList<>();
    Queue<Integer> q2=new LinkedList<>();

    void push(int x){
        q2.add(x);
        while(!q1.isEmpty()){
            q2.add(q1.remove());
        }

        Queue<Integer> temp=q1;
        q1=q2;
        q2=temp;
    }
        int pop(){
            if(q1.isEmpty()){
                System.out.println("stack is empty");
                return -1;
            }
            return q1.remove();
        }
        int peek(){
            if(q1.isEmpty()){
                System.out.println("stack is empty");
                return -1;
            }
            return q1.peek();
        }
        
        boolean isEmpty(){
            return q1.isEmpty();
        }
    
}
public class queue{
    public static void main(String[] args) {
        stackusingqueue s=new stackusingqueue();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s.isEmpty());
    }
}
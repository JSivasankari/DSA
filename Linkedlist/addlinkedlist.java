public class addlinkedlist{
static class node{
    int data; 
    node next;

    node(int data){
        this.data=data;
        this.next=null;
    }
}
    static class list{
        node head;
        void add(int data){
            node n=new node(data);
            if(head==null){
                head=n;
                return;
            }
            node temp=head;
            while(temp.next!=null){
                temp=temp.next;

            }
            temp.next=n;
        }
    
    void display(){
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
    }
}
    


    public static void main(String[] args){
       list li=new list();
       li.add(10);
       li.add(20);
       li.display();


        
    }
}
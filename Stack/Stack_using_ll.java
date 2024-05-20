class Node<T>{
    T data;
    Node next;
    static Node top= null;
    public Node(T data){
        this.data= data;
        this.next= null;
    }
}

class StackList<T>{
    public void push(T data){
        Node<T> newNode= new Node(data);
        if(Node.top==null){
            Node.top= newNode;
        }
        else{
            newNode.next= Node.top;
            Node.top= newNode;
        }
    }

    public T pop(){
        if(Node.top == null){
            return (T)"-1";
        }
        else{
            T val= (T)Node.top.data;
            Node.top= Node.top.next;
            return val; 
        }
    }

    public T peek(){
        if(Node.top==null){
            return (T)"-1";
        }
        else{
            return (T)Node.top.data;
        }
    }
}


public class Stack_using_ll {
    public static void main(String[] args) {
        StackList<Integer> s1= new StackList<>();
        s1.push(12);
        System.out.println(s1.peek());
    
    }
}

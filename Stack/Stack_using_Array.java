import java.util.Scanner;

class Stack<T>{
   int top;
   T[] arr;
   public Stack(int size){
        // arr= (T[]) new Object[size];
        arr= (T[]) new Object[size];
        top =-1;
   }

   public boolean isFull(){
    if(top == arr.length-1){
        return true;
    }else{
        return false;
    }
   }

   public boolean isEmpty(){
    if(top == -1){
        return true;
    }
    else{
        return false;
    }
   }

   public int push(T data){
    if(isFull()){
        return -1;
    }
    else{
        top++;
        arr[top]= data;
        return 1;
    }
   }

   public T pop(){
    if(isEmpty()){
        return (T)"-1";
    }
    else{
        T val= arr[top];
        top= top-1;
        return val;
    }
   }

   public T peek(){
    if(isEmpty()){
        return (T)"-1";
    }
    else{
        return arr[top];
    }
   }

   public void stack_ko_dekho(){
    if(isEmpty()){
        System.out.println("Stack Khali Hai!!!");
    }
    else{
        int temp = top;
        while (temp >= 0) {
            if(temp == top){
                System.out.println("top -> |"+arr[temp]+"|");
            }
            else{
                System.out.println("     ->|"+arr[temp]+"|");
            }
            temp--;
        }
        System.out.println("       ----");
    }
   }
}



public class Stack_using_Array{
    public static void main(String args[]){
        // Scanner sc= new Scanner(System.in);
        Stack<Integer> s1= new Stack(5);

        s1.push(12);
        s1.push(90);
        s1.push(22);
        s1.push(91);
        s1.push(11);
        s1.push(13);
        s1.pop();
        s1.pop();
        s1.stack_ko_dekho(); 
    }
}

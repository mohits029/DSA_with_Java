class Stack{
    static char stack1[];
    static int top= -1;

    public int push(char ch){
        if(isFull()){
            return -1;
        }
        else{
            top++;
            stack1[top]= ch;
            return 1;
        }
        
    }

    public int pop(){
        if(isEmpty()){
            return -1;
        }
        else{
            top--;
            return 1;
        }
    }


    //check whether the stack is empty
    public boolean isEmpty(){
        if(top== -1){
            return true;
        }
        else{
            return false;
        }
    }

    //check wether the list is full
    public boolean isFull(){
        if(top== stack1.length-1){
            return true;
        }
        else{
            return false;
        }
    }

}


public class Valid_Brackets {
    public static boolean isbalanced(String bracs){

        Stack s1= new Stack();
        
        Stack.stack1= new char[bracs.length()];
        for(int i=0; i<bracs.length(); i++){
            if(bracs.charAt(i)=='(' || bracs.charAt(i)=='{' || bracs.charAt(i)=='['){
                s1.push(bracs.charAt(i));
            }
            else{
                if(Stack.top==-1){
                    return false;
                }
                
                if(Stack.stack1[Stack.top]== '(' && bracs.charAt(i)==')' || Stack.stack1[Stack.top]== '{' && bracs.charAt(i)=='}' || Stack.stack1[Stack.top]== '[' && bracs.charAt(i)==']'){
                    s1.pop();
                }
                else{
                    break;
                }
            }
        }

        if(s1.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        String bracs= ")))()";
        System.out.println(isbalanced(bracs));
    }
}

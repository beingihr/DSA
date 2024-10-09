import java.util.Scanner;

class Node{
    char data;
    Node next;

    Node(char data){
        this.data = data;
    }
}
class Stack{
    Node top;

    char peek(){
        if(top != null)
        {
            return top.data;
        }
        else
        return ' ';
    }
    void push(char data){
        Node newNode = new Node(data);

        newNode.next = top;
        top = newNode; 
    }

    char pop(){
        if(top != null){
            char TopData = top.data;
            top = top.next;
            return TopData;
        }
        else{
            return ' ';
        }
    }
}

class lab5Ex4{
    int precedence(char c){
        if(c == '-')
        return 1;
        else if(c == '+')
        return 2;
        else if(c == '*')
        return 3;
        else if(c == '/')
        return 4;
        else
        return 0;
    }

    String convertPostfix(String infix){
        String postfix = "";
        Stack stack = new Stack();

        for(int i=0; i<infix.length(); i++){
            if((infix.charAt(i) >= 'A' && infix.charAt(i) <= 'Z') || (infix.charAt(i) >= 'a' && infix.charAt(i) <= 'z')){
                postfix = postfix + infix.charAt(i);
            }
             else if((infix.charAt(i) == '+') || (infix.charAt(i) == '-') || (infix.charAt(i) == '*') || (infix.charAt(i) == '/')){
                 if(stack.top == null){
                    stack.push(infix.charAt(i));
                }
                else{
                    while(precedence((stack.peek())) >= precedence(infix.charAt(i))){
                        postfix = postfix + stack.pop();
                    }
                    stack.push(infix.charAt(i));
                }
             }
        }
        while(stack.top != null){
            postfix = postfix + stack.pop();
        }
        return postfix;
    }
    public static void main(String[] args) {
        lab5Ex4 l = new lab5Ex4();
        Scanner inp = new Scanner(System.in);

        System.out.println("Enter the infix equation: ");
        String infix = inp.nextLine();

        System.out.println(l.convertPostfix(infix));
    }
    
}

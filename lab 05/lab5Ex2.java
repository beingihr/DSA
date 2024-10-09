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

    String BalancedBrackets(String eq){

        for(int i=0; i<eq.length(); i++){
            if((eq.charAt(i) == '{') || (eq.charAt(i) == '[') || (eq.charAt(i) == '(')){
                push(eq.charAt(i));
            }else if(eq.charAt(i) == ')'){
                if(pop() != '('){
                    return "Unblanced Brackets";
                }
            }else if(eq.charAt(i) == '}'){
                if(pop() != '{'){
                    return "Unblanced Brackets";
                }
            }else if(eq.charAt(i) == ']'){
                if(pop() != '['){
                    return "Unblanced Brackets";
                }
            }
        }
        if(pop() != ' '){
            return "Unblanced Brackets";
        }
        else{
            return "Balanced Brackets";
        } 
    }
}

class lab5Ex2{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Stack stack = new Stack();
        
        System.out.println("Enter the Equation: ");
        String eq = inp.nextLine();

        System.out.print(stack.BalancedBrackets(eq));
        

    }

    // ({[a+b]+c}-1)
}

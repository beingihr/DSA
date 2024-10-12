class Node {
    int data;
    Node next;

    Node(int data){
        this.data= data;
    }
}
class linkedList{
    Node head;
    Node tail;
    
    void addToBack(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode;
            tail = newNode; 
        }

    } 
   
    void remove(){
        if(head != null){
            head =head.next;
        }
        else{
            System.out.println("List empty");
        }
    }
    
    void removeLast(){
        if(head != null){
            Node temp = head;
            while(temp.next.next != null){
                temp = temp.next;
            } 
            tail = temp;
            temp.next = temp.next.next;
        }
    }
    
    void display(){
        if(head != null){
            Node temp = head;
            while (temp != null){
                System.out.println(temp.data);
                temp = temp.next;                
            }
        }
    }
    public static void main(String[] args) {
  

    }
    
}
class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
    }
}
class LinkedList{
    Node head;
    int size=0;
    
    void addToBack(int data){
        size++;
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }
        else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    void display(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    void printReverse(){
        if(head != null){
            for(int i=0; i<size; i++){
                Node temp = head;
                for(int j=1; j<size-i; j++){
                    temp = temp.next;
                }
                System.out.print(temp.data + " ");
            }}}}

class lab5Ex1{
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.addToBack(1);
        list.addToBack(2);
        list.addToBack(3);
        list.addToBack(4);
        list.addToBack(5);

        list.printReverse();
        System.out.println();
        list.display();}}

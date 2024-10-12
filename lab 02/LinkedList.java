class LinkedList{

 class Node{
    int data;
    Node next;

    Node(int data){ 
        this.data = data;
        this.next = next;
    }
}

Node head;
public void addnode(int data){

    Node newNode = new Node(data);
    if(head==null){
        head=newNode;
    }
    else{
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;

    }
}

public void search(int dataIndex){
    int count=0;
    Node temp=head;
    if(head==null){
        System.out.println("List is empty");
        return;
    }
    else{
        while(temp!=null){
            if(temp.data==dataIndex){
            System.out.println(" Element found on the index " +count);
    }
    count++;
    temp=temp.next;
        }
}}
public void display(){
    Node temp = head;
    while(temp!=null){
        System.out.print(temp.data+" ");
        temp=temp.next;
    }
    System.out.println();
}
public static void main(String[] args){
    LinkedList list = new LinkedList();
    list.addnode(1);
    list.addnode(2);
    list.addnode(3);
    list.addnode(4);
    list.display();
    System.out.println("Enter number you want to search");
    System.out.println("the value was  3 ");
    list.search(3);
 
}
}
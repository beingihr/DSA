class Node{
    String data;
    Node prev,next;

    Node(String data){
        this.data = data;
    }
}

class  DoubleLinkedList{
    Node head;

    void insertAtBeginning(String name){
        Node newNode = new Node(name);

        if(head == null){
            head = newNode;
        }
        else{
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        
    }

    void insertAtBeginning(Node newNode)
    {
        if(head == null){
            head = newNode;
        }
        else{
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    void insertAtEnd(String name){
        Node newNode = new Node(name);
        if(head == null){
            head = newNode;
        }
        else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
        }
    }
    
    void insertAtEnd(Node newNode){
        if(head == null){
            head = newNode;
        }
        else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            newNode.prev = temp;
            temp.next = newNode;
        }
    }

    void insertBeforeName(String name, Node newNode){
        if(head.data.equalsIgnoreCase(name)){
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        else{
            Node temp = head;
        while(temp != null){
            if(temp.data.equalsIgnoreCase(name)){
                newNode.next = temp;
                newNode.prev = temp.prev;
                temp.prev.next = newNode;
                temp.prev = newNode;
                System.out.println("true");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Name is not founded:");
        }

    }
    
    void insertAfterName(String name, Node node){
        Node temp = head;
        while(temp != null){
            if(temp.data.equalsIgnoreCase(name)){
                node.next = temp.next;
                node.prev = temp;
                temp.next.prev = node;
                temp.next = node;
                return;
            }
            temp = temp.next;
        }
        System.out.println("Name is not founded: ");
    }

    void makeCircular(){
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next=head; 
    }
    
    void printAll(){
    if(head != null){
        Node temp = head;
        while(temp.next != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
 }

}

class Lab3Task1{
    public static void main(String[] args) {
        DoubleLinkedList dList = new DoubleLinkedList();
        Node newNode = new Node("IMTIAZ");
        Node name = new Node("IMTIAZ");
        Node last = new Node("HUSSAIN");


        
        dList.insertAtBeginning("HUSSAIN");
        dList.insertAtBeginning(newNode);
        dList.insertAtEnd("RAJPER");
        dList.insertAtEnd(name);

        dList.insertAfterName("HUSSAIN", last);
      //  dList.makeCircular();
        dList.printAll();


    }
}
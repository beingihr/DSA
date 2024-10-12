public class Task2Lab2 {
    
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }


    Node head;
    int countnodes=0;
    void addnode(int data){
       
        Node newnode=new Node(data);
        countnodes++;
        if(head==null){
            head= newnode;

        }
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
                
                
            }
            // countnodes++;
            temp.next=newnode;

        }
    }

    void printNode(){
        if(head==null){
            System.out.println("Node is null");
        }
        else{
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data+ " ");
                temp= temp.next;
            }
            System.out.println();
            System.out.println(" the length of node is " +countnodes);
            
        }
    }

    public static void main(String args[]){
        Task2Lab2 lab=new Task2Lab2();
        lab.addnode(5);
        lab.addnode(3);
        lab.addnode(4);
        lab.addnode(1);
        lab.addnode(8);
        lab.printNode();

    }

}

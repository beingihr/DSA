class Task6 { 
    class Queue {
        class Node { 
            int data;       // integer data   
            Node next;      // pointer to the next node   
        
            public Node(int data) { 
                this.data = data; 
                this.next = null; 
            } 
        }
        
        Node head = null;  // head of the queue
    
        // Dequeue: delete at the beginning   
        public int dequeue() {  
            int num = -1;  // return -1 if the queue is empty
            if (head == null) {
                System.out.println("Queue is empty");
            } else {
                num = head.data;
                head = head.next;  // move the head to the next node
            }
            return num;
        }

        // Enqueue: insert at the end   
        public void enqueue(int item) {  
            Node node = new Node(item);
            if (head == null) {
                head = node;  // if queue is empty, head points to the new node
            } else {
                Node temp = head;
                while (temp.next != null) {
                    temp = temp.next;  // move to the last node
                }
                temp.next = node;  // attach new node at the end
            }
        }
    
        // Pop: return the front element without removing it   
        public int pop() { 
            if (head == null) {
                System.out.println("Queue is empty");
                return -1;  // return -1 if the queue is empty
            }   
            return head.data;  // return front element without dequeuing
        }
    
        // Check if the queue is empty   
        public boolean isEmpty() { 
            return head == null;
        }
    }

    private Queue s1, s2; 

    // Constructor   
    Task6() { 
        s1 = new Queue(); 
        s2 = new Queue(); 
    } 

    // Push an item to the queue (enqueue)
    public void push(int data) { 
        s1.enqueue(data);  // simply enqueue to stack s1
    } 

    // Dequeue an item from the queue   
    public int dequeue() { 
        if (s2.isEmpty()) {
            // Move all elements from s1 to s2, reversing the order
            while (!s1.isEmpty()) {
                s2.enqueue(s1.dequeue());
            }
        }
        // Dequeue from s2
        return s2.dequeue();   
    } 

    public static void main(String[] args) { 
        int[] keys = { 1, 2, 3, 4, 5 }; 
        Task6 q = new Task6(); 
        // insert above keys   
        for (int key : keys) { 
            q.push(key); 
        }

        // print dequeued elements
        System.out.println(q.dequeue());  // prints 1   
        System.out.println(q.dequeue());  // prints 2   
    } 
}

public class LinkedList<T>{

    Node<T> head;

    public LinkedList(){

        this.head=null;
    }

    public void add(T data){

        Node<T> newNode=new Node(data);

        if(head==null){

            this.head=newNode;
        }else{

            Node<T> temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
        }
    }

    public void print(){

        if(head==null){
            System.out.println("Linked list is empty");
        }else{

            Node<T> temp=head;

            while(temp.next!=null){

                System.out.print(temp.data +"->");
                temp=temp.next;
            }
            System.out.print(temp.data);
            System.out.println();
        }
    }

    public void addAtHead(T data){

        Node newNode = new Node(data);
            Node<T> temp = head;
            head = newNode;
            head.next = temp;

        }
        
    public void addAtPosition(T data,int position,LinkedList ll){

        Node newNode = new Node(data);

        if(head == null || position > ll.count()+1 || position<0){

            System.out.println("Give valid Index");
            return;
        }
        if(position == 0){
            newNode.next=head;
            head = newNode;
            return;
        }
        Node<T> temp=head;
        int count=0;
        while(temp.next != null && count < position-2){
            
            temp=temp.next;
            count++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void removeFirst(){

        if(head==null){
            System.out.println("Linkedlist is empty");

        }else{

            head=head.next;
        }
    }

    public int count(){

        Node<T> temp=head;
        int count=0;
        while(temp.next!=null){
            count++;
            temp=temp.next;
        }
        count++;
        return count;
    }
    public void removeLast(){

        Node<T> temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
    }


    public void removeByIndex(int index, LinkedList ll) {
        if (this.head == null || index >= ll.count() || index < 0) {
            System.out.println("Give valid Index");
            return;
        }
    
        if (index == 0) {
            head = head.next;
            return;
        }
    
        Node<T> temp = head;
        Node<T> previous = null;
        int count = 0;
    
        while (temp != null && count < index) {
            previous = temp;
            temp = temp.next;
            count++;
        }
    
        if (temp != null) {
            previous.next = temp.next;
        }
    }
    
    public void removeByData(T data) {
        if (head == null) {
            System.out.println("Linked list is empty");
            return;
        }
        
        if (head.data.equals(data)) {
            head = head.next;
            return;
        }
        
        Node<T> temp = head;
        Node<T> previous = null;
        
        while (temp != null) {
            if (temp.data.equals(data)) {
                previous.next = temp.next;
                return; 
            }
            previous = temp;
            temp = temp.next;
        }
        
        System.out.println("Data not found in the linked list");
    }
    
    public int search(T data) {
        if (head == null) {
            System.out.println("Linked list is empty");
            return 0;
        }
        
        if (head.data.equals(data)) {
            return 1;
        }
        
        Node<T> temp = head;
        int count=1;
        while (temp != null) {
            if (temp.data.equals(data)) {
                return count; 
            }
            count++;
            temp=temp.next;
        }
        
        System.out.println("Data not found in the linked list");
        return -1;
    }

    }
public class MyLinkedList<T> {
    private Node<T> head, tail;
    private int size = 0;

    public Node<T> GetHead() {
        return head;
    }

    public Node<T> GetTail() {
        return tail;
    }


    public void AddFront(T data) {
        Node<T> newNode = new Node<T>(data);
        if(head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void Append(T data) {
       
        if(head == null) {
            AddFront(data);           
            return;
        } 
        Node<T> currentNode = head;
        //while(currentNode.next != null) {
        //    currentNode = currentNode.next;
        //}

        Node<T> newNode = new Node<T>(data);
        tail.next = currentNode;
        tail = newNode;
        //currentNode.next = newNode;
        size++;    
    }

    public int GetSize() {
        return size; 
    }

    public void Insert(int index, T data) {
        if(index == size){
            Append(data);
        }

        if(index < 0 || index > size-1)
            return;

        Node<T> currentNode = head;
        for(int i = 0; i < index - 1; i++) {
            currentNode = currentNode.next;            
        }
        Node<T> newNode = new Node<T>(data, currentNode.next);
        currentNode.next = newNode;
        size++;
    }

    public void DeleteFront() {
        if (head == tail) {
            tail = null;
        }
        head = head.next;
        size--;
    }

    public void DeleteBack() {
        Node<T> currentNode = head;
        while (currentNode.next.next != null) {
            currentNode = currentNode.next;            
        }
        currentNode.next = null;
        tail = currentNode;
        size--;
    }

    public void DeleteNodeByValue(T data) {
        if(head == null) {
            return;
        }
        Node<T> currentNode = head;
        if(currentNode.data == data) {
            DeleteFront();
            size--;
            return;
        }
        if(currentNode.next == null) {
            return;
        }
        while(currentNode.next.data != data) {
            currentNode = currentNode.next;
            if(currentNode.next == null) {
                return;
            }
        }
        currentNode.next = currentNode.next.next;  
        if(currentNode.next == null) {
            tail = currentNode;
        }
        size--;             
    }

    @Override
    public String toString() {
        Node<T> currentNode = head;
        String returnString = "";
        while(currentNode != null) {
            returnString += " " + currentNode.data;
            currentNode = currentNode.next;
        }
        return returnString;
    }    
}

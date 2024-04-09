public class MyLinkedList<T> {
    private Node<T> head;
    private int size = 0;

    public void AddFront(T data) {
        Node<T> newNode = new Node<T>(data);
        if(head == null) {
            head = newNode;
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
        while(currentNode.next != null) {
            currentNode = currentNode.next;
        }
        Node<T> newNode = new Node<T>(data);
        currentNode.next = newNode;
        size++;    
    }

    public int GetSize() {
        return size; 
    }

    public void Insert(int index, T data) {
        Node<T> currentNode = head;
        for(int i = 0; i < index - 1; i++) {
            currentNode = currentNode.next;            
        }
        Node<T> newNode = new Node<T>(data, currentNode.next);
        currentNode.next = newNode;
        size++;
    }

    public void DeleteFront() {
        head = head.next;
    }

    public void DeleteBack() {
        Node<T> currentNode = head;
        while (currentNode.next.next != null) {
            currentNode = currentNode.next;            
        }
        currentNode.next = null;
    }

    public void DeleteNodeByValue(T data) {
        int cnt = 0;
        if(head == null) {
            return;
        }
        Node<T> currentNode = head;
        if(currentNode.data == data) {
            DeleteFront();
            size--;
            return;
        }
        while(currentNode.next.data != data) {
            currentNode = currentNode.next;
            cnt++;
        }
        if(cnt-1  == size) {
            return;
        }
        currentNode.next = currentNode.next.next;   
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

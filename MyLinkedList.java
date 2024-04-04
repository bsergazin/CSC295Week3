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

    public void Append(T data) {
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

    public void Insert(int index) {
        Node<T> currentNode = head;
        int cnt = 0;

        while (cnt < index) {
            currentNode = currentNode.next;
            
        }


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

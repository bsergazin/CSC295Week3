package CSC295Week3;

/**
 * MyArrayList
 */
public class MyArrayList<T> {
    private Object[] elements;
    private int size;
    private final int CAPACITY = 10;
    
    /**
     * Constructor
     */
    public MyArrayList() {
        elements = new Object[CAPACITY]; //initial capacity
        size = 0;
    }

    /**
     * Adds element to beginning of the array
     * @param elem element to add
     */
    public void AddStart(T elem) {
        EnsureCapacity();
        for (int i = size; i > 0; i--) {
            elements[i] = elements[i-1];
        } 
        elements[0] = elem;
        size++;        
    }

    /**
     * Adds element to the end of array
     * @param elem element to add
     */
    public void AddEnd(T elem) {
        EnsureCapacity();
        elements[size] = elem;
        size++;        
    }

    /**
     * Adds element to given idx, if idx is out of array adds element to the end
     * @param elem element to add
     * @param idx idx of elem to add
     */
    public void AddAtIndex(T elem, int idx) {
        if(idx > size || idx < 0) {
            AddEnd(elem);
        } else {
            EnsureCapacity();
            for (int i = size; i > idx; i--) {
                elements[i] = elements[i-1];
            } 
            elements[idx] = elem;
            size++; 
        }       
    }

    /**
     * Returns element by the idx, if idx is out of array returns last element
     * @param idx idx to get
     * @return element of array list
     */
    public Object GetElementAtIndex(int idx) {
        if(idx >= size || idx < 0) {
            return elements[size - 1];
        }
        return elements[idx];
    }

    /**
     * Check the capacity of elements array and increases its 
     * capacity if it isn't enough space
     */
    private void EnsureCapacity() {
        if(size == elements.length) {
            Object[] newElements = new Object[elements.length * 2];
            for(int i = 0; i < size; i++) {
                newElements[i] = elements[i];
            }
            elements = newElements;
        }
    }  
    /**
     * Delete at index
     * @param index - index to delete
     */
    public void DeleteAtIndex(int index) {
        if(index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index " + index + " is out of ArrayList");
        } else {
            for(int i = index; i < size-1; i++) {
                elements[i] = elements[i+1];
            }
            elements[size - 1] = 0; 
            size--;
        }     
    }

    public void DeleteAtStart() {
        DeleteAtIndex(0);
    }

    public void DeleteAtEnd() {
        DeleteAtIndex(size - 1);
    }
    
    /**
     * Clear all elements
     */
    public void ClearAll() {
        for(int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
    }

    /**
     * Checks if arrayList is empty
     * @return boolean 
     */
    public boolean isEmpty() {
        return size == 0;
    }


    /**
     * Returns size
     * @return size
     */
    public int Size() {
        return size;
    }


    /**
     * Printing elements
     */
    public void Print() {
        String res = "";
        res += '[';
        if (size == 1) {
           res += elements[size - 1];
        } 
        if(size > 1) {
            for(int i = 0; i < size - 1; i++) {
                res += elements[i] + ", ";
            }
            res += elements[size - 1];
        }
        res += ']';
        System.out.println(res);
    }
}
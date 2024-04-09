import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MyLinkedListTest {
    @Test
    public void DeleteNodeByValue_EmptyList_ListShouldRemainEmpty() {
        //arrange
        MyLinkedList<String> linkedList = new MyLinkedList<String>();
        //act
        linkedList.DeleteNodeByValue("Art");
        //assert
        assertEquals(0, linkedList.GetSize());
    }

    @Test
    public void DeleteNodeByValue_SingleNodeList_ListShouldDelete() {
        //arrange
        MyLinkedList<String> linkedList = new MyLinkedList<String>();
        linkedList.AddFront("Hello");
        //act
        linkedList.DeleteNodeByValue("Hello");
        //assert
        assertEquals(0, linkedList.GetSize());
        assertEquals(true, linkedList.isEmpty());
    }

    @Test
    public void DeleteNodeByValue_NodeInList_ShouldNotDelete() {
        //arrange
        MyLinkedList<String> linkedList = new MyLinkedList<String>();
        linkedList.AddFront("Hello");
        //act
        linkedList.DeleteNodeByValue("Art");
        //assert
        assertEquals(1, linkedList.GetSize());
        assertEquals(false, linkedList.isEmpty());
    }
}
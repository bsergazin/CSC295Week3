import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class MyLinkedListTest {

    @Test
    public void Insert_IntoLastPosition_ShouldUpdateTail() {
        MyLinkedList<String> linkedList = new MyLinkedList<String>();
        linkedList.AddFront("hi");
        linkedList.AddFront("hi hi");

        linkedList.Insert(2, "Hi Hi");

        assertEquals(3, linkedList.GetSize());
        assertEquals("Hi Hi", linkedList.GetTail().data);
    }

    @Test
    public void DeleteFront_ListOneElem_ShouldUpdateHeadTail() {
        MyLinkedList<String> linkedList = new MyLinkedList<String>();
        linkedList.AddFront("hi");

        linkedList.DeleteFront();

        assertEquals(0, linkedList.GetSize());
        
        assertEquals(null, linkedList.GetTail());
        
        assertEquals(null, linkedList.GetHead());
    }

    @Test
    public void DeleteBack_ListMultipleElem_ShouldUpdateHeadTail() {
        MyLinkedList<String> linkedList = new MyLinkedList<String>();
        linkedList.AddFront("hi");
        linkedList.AddFront("hi hi");
        linkedList.AddFront("hi hi hi");

        linkedList.DeleteBack();

        assertEquals(2, linkedList.GetSize());
        
        assertEquals("hi hi", linkedList.GetTail().data);
        
        assertEquals("hi hi hi", linkedList.GetHead().data);
    }

    @Test
    public void DeleteNodeByValue_ElementIsLast_ShouldDeleteElement() {
        MyLinkedList<String> linkedList = new MyLinkedList<String>();
        linkedList.AddFront("hi");
        linkedList.AddFront("hi hi");
        linkedList.AddFront("hi hi hi");

        linkedList.DeleteNodeByValue("hi");

        assertEquals(2, linkedList.GetSize());
        
        assertEquals("hi hi", linkedList.GetTail().data);
        
        assertEquals("hi hi hi", linkedList.GetHead().data);
    }
    
    
    
    /*
    @Test
    public void Insert_InvalidIndex_ShouldThrowException() {
        MyLinkedList<String> linkedList = new MyLinkedList<String>();
        
        assertThrows(IndexOutOfBoundsException.class, () -> linkedList.Insert(-1, "Hi"));

    }*/

    @Test
    public void Append_SingleNode_ShouldUpdateTail() {
        MyLinkedList<String> linkedList = new MyLinkedList<String>();
        linkedList.Append("Hi");

        assertEquals(linkedList.GetHead(), linkedList.GetTail());
        assertEquals(1, linkedList.GetSize());

    }

    @Test
    public void Append_MultipleNodes_ShouldUpdateTail() {
        MyLinkedList<String> linkedList = new MyLinkedList<String>();
        linkedList.Append("Hi");
        linkedList.Append("Hi Hi");
        linkedList.Append("Hi!");

        assertNotEquals(linkedList.GetHead(), linkedList.GetTail());
        assertEquals("Hi!", linkedList.GetTail().data);
        assertEquals("Hi", linkedList.GetHead().data);
        assertEquals(3, linkedList.GetSize());
    }


    @Test
    public void AddFront_SingleNode_ShouldUpdateHeadAndTail() {
        // arrange
        MyLinkedList<String> linkedList = new MyLinkedList<String>();

        // act
        linkedList.AddFront("Hi");

        // assert
        assertEquals(linkedList.GetHead(),linkedList.GetTail());
    }

    @Test
    public void AddFront_MultipleNodes_ShouldUpdateHeadAndTail() {
        // arrange
        MyLinkedList<String> linkedList = new MyLinkedList<String>();

        // act
        linkedList.AddFront("Hi");
        linkedList.AddFront("Hi!");

        // assert
        assertNotEquals(linkedList.GetHead(),linkedList.GetTail());
        assertEquals(linkedList.GetHead().data, "Hi!");
        assertEquals(linkedList.GetTail().data, "Hi");
    }


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
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MyArrayListTest {
    @Test
    public void testAddStart() {
        MyArrayList<Integer> myArrayList = new MyArrayList<Integer>();

        myArrayList.AddStart(20);

        assertEquals(myArrayList.Size(), 1);
        assertEquals(myArrayList.GetElementAtIndex(0), 20);


    }
}

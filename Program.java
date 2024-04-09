//package CSC295Week3;

/**
 * Program
 */
public class Program {
    public static void main(String[] args) {
        
        MyLinkedList<String> linkedList = new MyLinkedList<String>();
        linkedList.Append("World");
        linkedList.Append("Hi");
        linkedList.Append("Mike");

        linkedList.Append("Last");

        System.out.println(linkedList.toString());
        System.out.println(linkedList.GetSize());
        linkedList.Insert(2, "second");
        System.out.println(linkedList.toString());


        linkedList.DeleteBack();
        System.out.println(linkedList.toString());

        linkedList.DeleteNodeByValue("second");
        System.out.println(linkedList.toString());




        /* 
        int[] arr = {1, 3, 4};
        int[] arr1 = new int[3];

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));

        ArrayList<Integer> arrList = new ArrayList<Integer>();
        arrList.add(12);

        ArrayList<Integer> arrList1 = new ArrayList<Integer>();
        arrList1.add(23);
        arrList1.add(34);
        arrList1.add(45);

        arrList.addAll(arrList1);

        MyArrayList<Integer> myArrayList = new MyArrayList<Integer>();
        myArrayList.AddEnd(3);
        myArrayList.AddEnd(6);
        myArrayList.AddEnd(7);

        myArrayList.AddStart(0);


        myArrayList.AddAtIndex(151, 2);

        System.out.println(myArrayList.GetElementAtIndex(3));


        myArrayList.Print();

        try {
            myArrayList.DeleteAtIndex(2);
        } catch (Exception e) {
            System.out.println(e);
        }

        myArrayList.Print();

        System.out.println(myArrayList.isEmpty());
        System.out.println(myArrayList.Size());
        myArrayList.ClearAll();

        myArrayList.Print();
        System.out.println(myArrayList.Size());
        System.out.println(myArrayList.isEmpty());



        MyArrayList<String> myArrayList2 = new MyArrayList<String>();
        myArrayList2.AddStart("Hi");

        myArrayList2.Print();

        */

    }
}
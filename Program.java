package CSC295Week3;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Program
 */
public class Program {
    public static void main(String[] args) {
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

        MyArrayList myArrayList = new MyArrayList();
        myArrayList.AddEnd(3);
        myArrayList.AddEnd(6);
        myArrayList.AddEnd(7);

        myArrayList.AddStart(0);


        myArrayList.AddAtIndex(151, 2);

        System.out.println(myArrayList.GetElementAtIndex(3));


        myArrayList.Print();

    }
}
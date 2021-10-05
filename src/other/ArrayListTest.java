package other;

//import  java.util.*;
import  java.util.ArrayList;
import  java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {
        /*
        int [] arr = new int[0];
        System.out.println(arr.length);
         */
        List<Integer> list = new ArrayList();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(100);

        int removeVal = list.remove(0); //return 해줌.
        System.out.println("removeVal : "+ removeVal);

        for(int i=0; i<list.size(); i++){
            System.out.printf("(%d) - %d\n",i, list.get(i));
        }

        //list.remove(2);
        // List list =new ArrayList();      List와 ArrayList는 상속관계  List가 부모타입
        System.out.println(list);

        MyArrayList myList = new MyArrayList();
        myList.add(10);
        myList.add(20);
        myList.add(30);
        myList.add(100);
        myList.print();
        
        
        
    }
}

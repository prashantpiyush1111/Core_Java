import java.util.*;
public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<>();
        // ArrayList<String> list2 =new ArrayList<>();
        // ArrayList<Boolean> list3 =new ArrayList<>();
        // Add Element
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(list);
        //Get Element
        int Element=list.get(2);
        System.out.println(Element);
        //Remove Element 
        list.remove(5);
        System.out.println(list);
        //Set Element at index
        list.set(3, 10);
        System.out.println(list);
        //Contain Element 
        System.out.println(list.contains(4));
    }
}

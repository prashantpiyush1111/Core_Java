import java.util.*;
public class SizeofArray {
    public static void main(String[] args) {
        ArrayList<Integer>list =new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(8);
        list.add(9);
        list.add(4);
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
System.out.println();
    }
    
}

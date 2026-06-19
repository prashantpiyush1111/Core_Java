
import java.util.ArrayList;

public class PairSum {
    public static boolean pairSum1(ArrayList<Integer>list,int target){
        int leftPointer=0;
        int rightPointer=list.size()-1;
        while(leftPointer!=rightPointer){
            //case 1
            if(list.get(leftPointer)+list.get(rightPointer)==target){
                return true;
            }
            //case 2
            if(list.get(leftPointer)+list.get(rightPointer)<target){
                leftPointer++;
            }
            else{
                //case3 
                rightPointer--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        list.add(25);
        list.add(25);
        int target=50;
        System.out.println(pairSum1(list,target));
    }
}

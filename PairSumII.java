import java.util.*;
public class PairSumII {
    public static boolean pairSum2(ArrayList<Integer>list,int target){
        int bp=-1; //Breaking Point
        int n=list.size();
        for(int i=0;i<list.size();i++){
            if(list.get(i)>list.get(i+1)){//Breaking Point
                bp=i;
                break;
            }
        }
        int leftPointer=bp+1; //smalllest
        int rightPointer=bp;//largest
        while(leftPointer!=rightPointer){
            //Case 1
            if(list.get(leftPointer)+list.get(rightPointer)==target){
                return true;
            }
            // Case 2
            if(list.get(leftPointer)+list.get(rightPointer)<target){
                leftPointer=(leftPointer+1)%n;
            }
            else{
                //Case 3
                rightPointer=(n+rightPointer-1)%n;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        //11,15,6,8,9,10    -----sorted and rotated
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target=16;
        System.out.println(pairSum2(list,target));
    }
}


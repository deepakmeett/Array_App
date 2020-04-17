package Practice;
import java.util.ArrayList;
public class ArrayLis {

    public static void main(String[] args) {
        //          About ArrayList
        // It saves the memory
        // Thread not safe, unsynchronized
        // Fast
        // We don't need of index number to input the value
        // We don't declare the size of the list. 
        //allows duplicate number
        //We can add and remove value
        ArrayList<Integer> arrayList = new ArrayList<>(); 

        arrayList.add(2);
        arrayList.add(1);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(7);
        arrayList.add(8);
        arrayList.add(9);
        arrayList.add(5);
        arrayList.add(0);
        arrayList.add(2);
        arrayList.add(2);
        
        arrayList.remove( 3 );
        arrayList.add( 2, 0 );//We can add value in between on aerialist but not in list
        
        System.out.println(  );

        for (int i : arrayList) {
            System.out.print( i + "," );
        }
    }
}
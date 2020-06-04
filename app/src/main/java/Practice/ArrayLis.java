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
        arrayList.add( 2 );
        arrayList.add( 1 );
        arrayList.add( 5 );
        arrayList.add( 6 );
        arrayList.add( 7 );
        arrayList.add( 8 );
        arrayList.add( 9 );
        arrayList.add( 5 );
        arrayList.add( 0 );
        arrayList.add( 2 );
        arrayList.add( 2 );
        arrayList.remove( 3 );
        arrayList.add( 2, 0 );//We can add value in between on aerialist.
        
        for (int i : arrayList) {
            System.out.print( i + "," );
        }
        
        System.out.println();
        System.out.println();
        int name = arrayList.size();
        System.out.println( "Size of ArrayList : " + name );
        
        if (arrayList.isEmpty()){
            System.out.println( "ArrayList is Empty" );
        }else {
            System.out.println( "ArrayList is not Empty" );
        }

        if (arrayList.contains( 1 )){
            System.out.println( "ArrayList has 1" );
        }else {
            System.out.println( "ArrayList has not 1" );
        }
        
        int number = arrayList.indexOf( 2 );
        System.out.println( number );
    }
}
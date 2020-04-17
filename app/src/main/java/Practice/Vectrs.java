package Practice;
import java.util.Vector;
public class Vectrs {

    public static void main(String[] args) {
        //             About Vector
        // We can also call vector as Dynamic array.
        // It came with Java
        // Thread safe, synchronized
        // Slow
        Vector<Integer> vectrs = new Vector<>(); 

        vectrs.add(2);
        vectrs.add(1);
        vectrs.add(5);
        vectrs.add(6);
        vectrs.add(7);
        vectrs.add(8);
        vectrs.add(9);
        vectrs.add(5);
        vectrs.add(0);
        vectrs.add(2);
        vectrs.add(2);
        
        System.out.println( vectrs.capacity() );// if you want to get the capacity of Vector of all element then it will show you(if you have added less than or equal to 10 then it will show you 10) and this algorithm for same like 20, 30 and so on. That's why vectors waist lots of memory
        
        vectrs.remove( 3 );
        System.out.println(  );

        for (int i : vectrs) {
            System.out.print( i + "," );
        }
    }
}
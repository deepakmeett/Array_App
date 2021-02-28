package Practice;
import java.util.HashSet;
import java.util.Set;
public class SetInteface {

    public static void main(String[] args) {
        Set<Integer> list = new HashSet<>(  );
        list.add( 9 );
        list.add( 8 );
        list.add( 4 );
        list.add( 3 );
        list.add( 5 );
        list.add( 0 );
        list.add( 3 ); // Set will not print duplicate element. It will print only unique elements.
        
        for (int i :list) {
            System.out.println( i );
        }
    }
}
package Practice;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
public class ListInteface {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(  );
        list.add( 3 );
        list.add( 4 );
        list.add( 1 );
        list.add( 2 );
        list.add( 2 );
        list.add( 3, 8 ); // We can not add between in the collection. But we can add between in List
        
//        Collections.sort( list ); // We can not sort in the collection. But we can apply sort in List
        
        for (int i :list) {
            System.out.println( i );
        }
    }
}
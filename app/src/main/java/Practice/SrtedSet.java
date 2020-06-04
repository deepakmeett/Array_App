package Practice;
import java.util.SortedSet;
import java.util.TreeSet;
public class SrtedSet {
    
    public static void main(String[] args) {
        SortedSet<String > sortedSet = new TreeSet<>( );
        sortedSet.add( "a" );
        sortedSet.add( "b" );
        sortedSet.add( "c" );
        sortedSet.add( "d" );
        sortedSet.add( "e" );
        sortedSet.add( "f" );
        sortedSet.add( "g" );
        sortedSet.add( "h" );
        sortedSet.add( "i" );

        System.out.println( sortedSet );
        System.out.println( "     All values --^--" );
        System.out.println( "First Value of the list : " + sortedSet.first() );
        System.out.println( "Last Value of the list : " + sortedSet.last() );
        System.out.println(  );
        System.out.println(  );
        
        SortedSet<String> beforeThisPoint = sortedSet.headSet( "h" );
        System.out.println( beforeThisPoint );
        System.out.println( "If we want to get all values before this point ( h )" );
        System.out.println();
        
        SortedSet<String > betweenThesePoints = sortedSet.subSet( "b", "h" );
        System.out.println( betweenThesePoints );
        System.out.println( "If we want to get all values between these point ( b, h  )" );
        System.out.println();

        SortedSet<String> afterThisPoint = sortedSet.tailSet( "b" );
        System.out.println( afterThisPoint );
        System.out.println( "If we want to get all values after this point ( b )" );
    }
    
}

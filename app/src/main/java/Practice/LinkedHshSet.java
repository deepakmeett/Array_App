package Practice;
import java.util.LinkedHashSet;
public class LinkedHshSet {
    
    public static void main(String[] args) {
        
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        
//        linkedHashSet.add("Andrew" );
//        linkedHashSet.add("John" );
//        linkedHashSet.add("Sky" );
//        linkedHashSet.add("Amy" );
//        linkedHashSet.add("Xavier" );

        linkedHashSet.add( 2 );
        linkedHashSet.add( 5 );
        linkedHashSet.add( 1 );
        linkedHashSet.add( 1 );
        linkedHashSet.add( 4 );
        
        linkedHashSet.remove( 2 );
//        linkedHashSet.clear();

        boolean key = linkedHashSet.contains( 5 );
        System.out.println("Is linkedHashSet contains key 5: " + key );
        System.out.println("Size : " + linkedHashSet.size());
        System.out.println("isEmpty : " + linkedHashSet.isEmpty());
        
        for (Integer integer : linkedHashSet) {
            System.out.println( integer );
        }
    }
}
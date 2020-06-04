package Practice;
import java.util.HashSet;
public class HshSet {
    
    public static void main(String[] args) {
        
        HashSet<Integer> hashSet = new HashSet<>();
        
//        hashSet.add("Andrew" );
//        hashSet.add("John" );
//        hashSet.add("Sky" );
//        hashSet.add("Amy" );
//        hashSet.add("Xavier" );

        hashSet.add( 2 );
        hashSet.add( 5 );
        hashSet.add( 1 );
        hashSet.add( 1 );
        hashSet.add( 4 );
        
        hashSet.remove( 2 );
//        hashSet.clear();

        boolean key = hashSet.contains( 5 );
        System.out.println("Is hashSet contains key 5: " + key );
        System.out.println("Size : " + hashSet.size());
        System.out.println("isEmpty : " + hashSet.isEmpty());
        
        for (Integer integer : hashSet) {
            System.out.println( integer );
        }
    }
}
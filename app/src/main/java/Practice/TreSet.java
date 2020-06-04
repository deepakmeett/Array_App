package Practice;
import java.util.TreeSet;
public class TreSet {
    
    public static void main(String[] args) {
        
        TreeSet<Integer> treeSet = new TreeSet<>();
        
//        treeSet.add("Andrew" );
//        treeSet.add("John" );
//        treeSet.add("Sky" );
//        treeSet.add("Amy" );
//        treeSet.add("Xavier" );

        treeSet.add( 2 );
        treeSet.add( 5 );
        treeSet.add( 1 );
        treeSet.add( 1 );
        treeSet.add( 4 );
        
        treeSet.remove( 2 );
//        treeSet.clear();

        boolean key = treeSet.contains( 5 );
        System.out.println("Is treeSet contains key 5: " + key );
        System.out.println("Size : " + treeSet.size());
        System.out.println("isEmpty : " + treeSet.isEmpty());
        
        for (Integer integer : treeSet) {
            System.out.println( integer );
        }
    }
}
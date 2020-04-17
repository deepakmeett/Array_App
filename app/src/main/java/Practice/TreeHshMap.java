package Practice;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
public class TreeHshMap {
//          About TreeMap
//  If we want to print data in sorted format then we should use TreeMap.
    // TreeMap may have some other functionality. I don't know. 

    public static void main(String[] args) {

        TreeMap<Integer, Integer> treeMap = new TreeMap<>();

        treeMap.put( 1, 5 );
        treeMap.put( 4, 5 );//allows duplicate
        treeMap.put( 6, 4 );
        treeMap.put( 8, 9 );
        treeMap.put( 5, 7 );
        System.out.println( treeMap.get( 4 ) );// for only single output
        Set<Integer> keys = treeMap.keySet(); // for all data
        for (Integer i : keys) {
            System.out.println( treeMap.get( i ) );
        }
        Set<Map.Entry<Integer, Integer>> values = treeMap.entrySet();
        for (Map.Entry<Integer, Integer> e : values) {
            System.out.println( e.getKey() + " : " + e.getValue() );
        }
    }

}

package Practice;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
public class LinkedHshMap {
//          About LinkedHashMap
//  If we want to print in same style as we put the data then we should use LinkedHashMap.
//  does't support alphabetic order and numeric order

    public static void main(String[] args) {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
//        linkedHashMap.put( 1, 5 );
//        linkedHashMap.put( 2, 5 );//allows duplicate values
//        linkedHashMap.put( 6, 4 );
//        linkedHashMap.put( 8, 9 );
//        linkedHashMap.put( 5, 7 );
        
        linkedHashMap.put( "a", "jack" );
        linkedHashMap.put( "d", "sky" );
        linkedHashMap.put( "g", "john" );
        linkedHashMap.put( "b", "florian" );
        
        System.out.println( linkedHashMap.get( 5 ) );// for only single output
        System.out.println();
        linkedHashMap.remove( 5 );
        Set<String> keys = linkedHashMap.keySet(); // for all data
        for (String i : keys) {
            System.out.println( linkedHashMap.get( i ) );
        }
        System.out.println();
        Set<Map.Entry<String, String>> values = linkedHashMap.entrySet();
        for (Map.Entry<String, String> e : values) {
            System.out.println( e.getKey() + " : " + e.getValue() );
        }
    }
}
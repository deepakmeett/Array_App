package Practice;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hshmap {
    
//          About HashMap
    
//    Introduced in 1.2 version
//    It is not thread safe and unsynchronized
//    It is fast
//    Works with single thread
//    Allows one null key
    
    public static void main(String[] args) {
        
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        
//        hashMap.put( "m", "Andrew" );
//        hashMap.put( "c", "John" );
//        hashMap.put( "d", "Sky" );
//        hashMap.put( "l", "Amy" );// It allows alphabetic order and numeric oreder
//        hashMap.put( "e", "Xavier" );//It allows duplicate values

        hashMap.put( 2, 3 );//It does't allows duplicate key
        hashMap.put( 5, 3 );
        hashMap.put( 1, 3 );
        hashMap.put( 4, 3 );
        
        System.out.println( hashMap.get( "a" ) );// for only single output
        
        Set<Integer> keys = hashMap.keySet(); // for all data
        for (Integer i : keys) {
            System.out.println( hashMap.get( i ) );
        }
        
        Set<Map.Entry<Integer, Integer>> values = hashMap.entrySet();
        for (Map.Entry<Integer, Integer> e : values ) {
            System.out.println( e.getKey()+" : "+e.getValue() );
        }
    }

}

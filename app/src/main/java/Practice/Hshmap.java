package Practice;
import android.os.Build;

import androidx.annotation.RequiresApi;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hshmap {
    
//          About HashMap
    
//    Introduced in 1.2 version
//    It is not thread safe and un-synchronized
//    It is fast
//    Works with single thread
//    Allows one null key
//    It allows alphabetic order and numeric order for only keys
//    It allows duplicate values
//    It does't allows duplicate key
//    check contain key
//    check contain value
//    putIfAbsent
//    replace the value of any key
//    replace the value of any key from the old to new value
//    We can clear all values from hashmap list
    
    @RequiresApi(api = Build.VERSION_CODES.N)
    public static void main(String[] args) {
        
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        
//        hashMap.put( "m", "Andrew" );
//        hashMap.put( "c", "John" );
//        hashMap.put( "d", "Sky" );
//        hashMap.put( "l", "Amy" );
//        hashMap.put( "e", "Xavier" );

        hashMap.put( 2, 3 );
        hashMap.put( 5, 9 );
        hashMap.put( 1, 6 );
        hashMap.put( 4, 3 );
        
        hashMap.remove( 2 );
//        hashMap.clear();
        
        System.out.println( hashMap.get( "a" ) );// for only single output
        
        Set<Integer> keys = hashMap.keySet(); // for all data
        for (Integer i : keys) {
            System.out.println( hashMap.get( i ) );
        }
        
        Set<Map.Entry<Integer, Integer>> values = hashMap.entrySet();
        for (Map.Entry<Integer, Integer> e : values ) {
            System.out.println( e.getKey()+" : "+e.getValue() );
        }
        System.out.println(  );

        boolean key = hashMap.containsKey( 5 );
        System.out.println("Is hashmap contains key 5: " + key );
        
        boolean value = hashMap.containsValue( 6 );
        System.out.println("Is hashmap contains value 6: " + value );
        
        hashMap.putIfAbsent( 9, 8 );
        hashMap.replace( 9, 0 );
        hashMap.replace( 9, 0, 88 );

        System.out.println(  );

        for (Integer i : keys) {
            System.out.print( hashMap.get( i )+ "," );
        }

        System.out.println(  );
        
    }
}

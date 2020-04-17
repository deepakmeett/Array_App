package Practice;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
public class HshTable {
    
//          About HashTable
    
//    There since Java was introduced
//    It is thread safe and synchronized
//    It is slow
//    Works with multi thread
//    Does not allow null key
//    allows duplicate 

    public static void main(String[] args) { 

        Hashtable<String, String> hashtable = new Hashtable<>();

        hashtable.put( "z", "Andrew" );
        hashtable.put( "x", "John" );
        hashtable.put( "f", "Amy" );
        hashtable.put( "k", "Sky" );
        hashtable.put( "e", "Xavier" );//It doesn't allow order like alphabetic or numeric 
        
        System.out.println( hashtable.get( "a" ) );// for only single output
        
        Set<String> keys = hashtable.keySet(); // for all data
        for (String i : keys) {
            System.out.println( hashtable.get( i ) );
        }
        
        Set<Map.Entry<String, String>> values = hashtable.entrySet();
        for (Map.Entry<String, String> e : values ) {
            System.out.println( e.getKey()+" : "+e.getValue() );
        }
    }

}

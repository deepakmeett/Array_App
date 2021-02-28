package Practice;
import java.util.SortedMap;
import java.util.TreeMap;
public class SrtedMap {

    public static void main(String[] args) {
        SortedMap<Integer, String> sortedMap = new TreeMap<>();
        sortedMap.put( 1, "a" );
        sortedMap.put( 2, "b" );
        sortedMap.put( 3, "c" );
        sortedMap.put( 4, "d" );
        sortedMap.put( 5, "e" );
        sortedMap.put( 6, "f" );
        sortedMap.put( 7, "g" );
        sortedMap.put( 8, "h" );
        sortedMap.put( 9, "i" );
        
        System.out.println( sortedMap );
        System.out.println( "     All values --^--" );
        System.out.println();
        System.out.println( "First Value of the list : " + sortedMap.firstKey() );
        System.out.println( "Last Value of the list : " + sortedMap.lastKey() );
        System.out.println();
        System.out.println( "get all values before this point 8 : " + sortedMap.headMap(8) );
        System.out.println("get all values between these point 2, 6 : "+sortedMap.subMap(2,6) );
        System.out.println( "all values after this point 2 : " + sortedMap.tailMap(2) );
        System.out.println();
        System.out.println("To get particular value : " + sortedMap.get( 7 ));
        System.out.println();
        System.out.println("HashCode is used to generate a hashcode for the given map containing key and values : " + sortedMap.hashCode());
        System.out.println();
        System.out.println("If we only want to get values : " + sortedMap.values());
        System.out.println("If we only want to get keys : " + sortedMap.keySet());
        System.out.println();
        
        SortedMap<Integer, String> sortedMap1 = new TreeMap<>();
        sortedMap1.put( 10, "j" );
        sortedMap1.putAll( sortedMap );
        System.out.println("If we want to combine two sortedMap list data : " + sortedMap1);
    }

}

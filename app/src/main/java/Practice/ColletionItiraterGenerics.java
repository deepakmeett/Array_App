package Practice;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
public class ColletionItiraterGenerics {

    public static void main(String[] args) {
        int[] values = new int[4]; // We declare size of the array first
        values[0] = 1;// We need index number to put the value
        values[1] = 5;
        values[2] = 7;
        values[3] = 9;
        System.out.println( "Simple Array, we can use only int type of data because we have used int here" );
        for (int i : values) {
            System.out.print( i + "," );
        }
        System.out.println();


        Object[] values1 = new Object[4];
        values1[0] = 5;
        values1[1] = "Deepak";
        values1[2] = 5.5f;
        values1[3] = 60;
        System.out.println();
        System.out.println( "Simple Array, we can use any type of data because we have used Object here" );
        for (Object i : values1) {
            System.out.print( i + "," );
        }
        System.out.println();

        Collection values3 = new ArrayList();
        values3.add( 1 );
        values3.add( "Deep" );
        values3.add( 5.5f );
        values3.add( 7 );
        System.out.println();
        System.out.println( "In Collection, we can use any type of data because we have not used generics here as parameter of Integer" );
        Iterator i = values3.iterator();
        while (i.hasNext()) {
            System.out.print( i.next()+ ", " );
        }
        System.out.println();

        Collection<Integer> values4 = new ArrayList<>();
        values4.add( 1 );
        values4.add( 2 );
        values4.add( 5 );
        values4.add( 7 );
        System.out.println();
        System.out.println( "In Collection, we can use only int type of data because we have used generics here as parameter of Integer" );
        Iterator im = values4.iterator();
        System.out.print( im.next() + ", ");
        System.out.print( im.next()+ ", ");
        System.out.print( im.next()+ ", ");
        System.out.print( im.next()+ ", ");
        System.out.println();
    }
}

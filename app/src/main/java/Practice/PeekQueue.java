package Practice;
import java.util.ArrayDeque;
import java.util.Queue;
public class PeekQueue {

    public static void main(String[] args) {

        System.out.println( "FIFO(First in First Out) concept uses in Queue" );
        System.out.println(  );
        
        Queue<String> waitingQueue = new ArrayDeque<>(  );

        waitingQueue.add( "Jack" );//Adding new element in Queue
        waitingQueue.add( "Queen" );
        waitingQueue.add( "Alex" );
        waitingQueue.add( "King" );
        System.out.println( "WaitingQueue : " + waitingQueue );
        System.out.println( );
        
        //Check if Queue if empty
        System.out.println( "is waitingQueue empty? " + waitingQueue.isEmpty() );
        System.out.println( );

        //Check Queue size
        System.out.println( "WaitingQueue size is : " + waitingQueue.size() );
        System.out.println(  );
        
        //Check if the Queue contains an element
        String name = "Alex";
        if (waitingQueue.contains( name )){
            System.out.println( "WaitingQueue contains : " + name );
        }else {
            System.out.println( "WaitingQueue doesn't contain : " + name );
        }
        System.out.println(  );
        
        //Check who is the first person. We can also use peek() to check first person but peek() will return null if queue is empty and element() will through exception(NoSuchElementException)
        String firstPersonInTheWaitingQueue = waitingQueue.element();
        System.out.println( "First person in the waitingQueue : "+ firstPersonInTheWaitingQueue );
    }
}
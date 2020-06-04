package Practice;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
public class Queu {

    public static void main(String[] args) {

        System.out.println( "FIFO(First in First Out) concept uses in Queue" );
        System.out.println(  );

        Queue<String> waitingQueue = new LinkedList<>(  );//Creating a Queue(We can use Array or LinkedList)

        waitingQueue.add( "Jack" );//Adding new element in Queue
        waitingQueue.add( "King" );
        waitingQueue.add( "Queen" );
        waitingQueue.add( "Alex" );
        System.out.println( "WaitingQueue: " + waitingQueue );
        System.out.println(  );
        
        String name = waitingQueue.remove();//Removing an element from the Queue using remove
        // Remove() keyword returns exception(NoSuchElementException) if the Queue is empty  
        System.out.println( "Removed from WaitingQueue : " + name );
        System.out.println( "New WaitingQueue is : " + waitingQueue );
        System.out.println(  );
        
        name = waitingQueue.poll();//Removing an element from the Queue using poll
        //The poll() keyword returns null if the Queue is empty 
        System.out.println( "Poll from WaitingQueue : " + name );
        System.out.println( "New WaitingQueue is : " + waitingQueue  );
    }
}
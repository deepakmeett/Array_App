package Practice;
import java.util.Stack;
public class Stak {

    public static void main(String[] args) {

        System.out.println( "LIFO(Last in First Out) concept uses in Stack" );
        System.out.println(  );
        
        Stack<String> stackOfCards = new Stack<>();//Creating a Stack
        
        stackOfCards.push( "Sun" );//Pushing(Adding) new items to the stackOfCards
        stackOfCards.push( "Mon" );
        stackOfCards.push( "Tue" );
        stackOfCards.push( "Wed" );
        stackOfCards.push( "Thu" );
        stackOfCards.push( "Fri" );
        stackOfCards.push( "Sat" );
        System.out.println( "Stack = " + stackOfCards ); 
        System.out.println(  );
        
        String cardAtTop = stackOfCards.pop(); //Popping(Delete) items from the Stack
        System.out.println( "Stack.pop() = " + cardAtTop );
        System.out.println( "Current Stack = " + stackOfCards );
        System.out.println(  );
        
        cardAtTop = stackOfCards.peek();//Peek(Search)/Get the item at top of the stack without removing it
        System.out.println( "Stack.peek() = " + cardAtTop );
        System.out.println( "Current Stack = " + stackOfCards );
    }
}
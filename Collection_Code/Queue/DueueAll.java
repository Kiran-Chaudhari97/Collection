package Collection_Code.Queue;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;

public class DueueAll {
    public static void main(String[] args) {
        /*
        The Deque interface present in java.util package is a subtype
        of the queue interface. The Deque is related to the double-ended
        queue that supports addition or removal of elements from either
        end of the data structure.
        It can either be used as a queue(first-in-first-out/FIFO) or as
        a stack(last-in-first-out/LIFO).
        Deque is the acronym for double ended queue.

        */

                Deque<Integer> dq=new ArrayDeque<Integer>();

                /*Methods                           Description
                ---------------------------------------------------------------------------
                add(element)                      This method is used to add an element at the tail of the queue.
                                                  If the Deque is capacity restricted and no space is left for insertion,it returns an IllegalStateException.
                                                  The function returns true on successful insertion.
                Example:-
                */
                dq.add(20);
                dq.add(10);
                dq.add(50);
                dq.add(30);
                dq.add(40);

                System.out.println(dq);





                /*Methods                           Description
                ---------------------------------------------------------------------------
                addFirst(element)                 This method is used to add an element at the head of the queue.
                                                  If the Deque is capacity restricted and no space is left for insertion,
                                                  it returns an IllegalStateException. The function returns true on successful insertion.

               Example:
               */
                dq.addFirst(5);
                System.out.println("addFirst (element)"+dq);



                /*Methods                           Description
                ---------------------------------------------------------------------------
                addLast(element)                  This method is used to add an element at the tail of the queue.
                                                  If the Deque is capacity restricted and no space is left for insertion,
                                                  it returns an IllegalStateException.
                                                  The function returns true on successful insertion.

                      Example:

               */
                dq.addLast(22);
                dq.addLast(27);
                dq.addLast(24);
                dq.addLast(21);

                System.out.println("addLast(element)"+dq);



                /*Methods                           Description
                ---------------------------------------------------------------------------
                contains()                       This method is used to check whether the queue contains the given object or not.
                */


                System.out.println("Contains Are Avaible "+dq.contains(2));


               /* Methods                           Description
                ---------------------------------------------------------------------------
                descendingIterator()             This method returns an iterator for the deque.
                                                 The elements will be returned in order from last(tail) to first(head).
                Example

                */

                 System.out.println(dq.descendingIterator());


                /*Methods                           Description
                ---------------------------------------------------------------------------
                element()                        This method is used to retrieve, but not remove,
                                                 the head of the queue represented by this deque.

                */
                System.out.println(dq.element());
                /*Methods                           Description
                ---------------------------------------------------------------------------
                getFirst()                        This method is used to retrieve, but not remove, the first element of this deque.
                */
                System.out.println(dq.getFirst());

               /* Methods                           Description
                ---------------------------------------------------------------------------
                getLast()                         This method is used to retrieve, but not remove, the last element of this deque.

*/

                /*Methods                           Description
                ---------------------------------------------------------------------------
                iterator()                        This method returns an iterator for the deque.
                                                  The elements will be returned in order from first (head) to last (tail).
*/
               /* Methods                           Description
                ---------------------------------------------------------------------------
                offer(element)                    This method is used to add an element at the tail of the queue.
                                                  This method is preferable to add() method since this method does not throws
                                                  an exception when the capacity of the container is full since it returns false.

*/
                /*Methods                           Description
                ---------------------------------------------------------------------------
                offerFirst(element)               This method is used to add an element at the head of the queue.
                                                  This method is preferable to addFirst() method since this method does not throws an exception when the capacity of the container is full since it returns false.
              */
                /*Methods                           Description
                ---------------------------------------------------------------------------
                offerLast(element)                 This method is used to add an element at the tail of the queue.
                                                   This method is preferable to add() method since this method does not throws an exception
                                                   when the capacity of the container is full since it returns false.
*/
                /*Methods                           Description
                ---------------------------------------------------------------------------
                peek()                            This method is used to retrieve the element at the head of the deque but doesn’t remove the element from the deque.
                                                  This method returns null if the deque is empty.
*/
                /*Methods                           Description
                ---------------------------------------------------------------------------

                Methods                           Description
                ---------------------------------------------------------------------------

                Methods                           Description
                ---------------------------------------------------------------------------

                Methods                           Description
                ---------------------------------------------------------------------------

                Methods                           Description
                ---------------------------------------------------------------------------
                Methods                           Description
                ---------------------------------------------------------------------------

                Methods                           Description
                ---------------------------------------------------------------------------

*/



    }
}

package Collection_Code.Queue;

import java.util.PriorityQueue;

public class QueueAll {
    public static void main(String[] args) {
        /*  Methods of Queue Interface */
        /*
            Methods                           Description
      ---------------------------------------------------------------------------
            add(element)                    This method is used to add elements at the tail of queue.
                                            More specifically, at the last of linked-list if it is used,
                                            or according to the priority in case of priority queue implementation.
        */
        //Example:-

          PriorityQueue<Integer> queue = new PriorityQueue<Integer>();

          queue.add(20);//==============>add(element)
          queue.add(10);
          queue.add(5);
          queue.add(0);
          queue.add(2);
          queue.add(4);

        System.out.println(queue);
        /*
                            Methods                           Description
                ---------------------------------------------------------------------------
                element()                               This method is similar to peek().
                                                        It throws NoSuchElementException when the queue is empty.
        */
        //Example

        System.out.println(queue.element());

        /*
                     Methods                           Description
                ---------------------------------------------------------------------------
                offer(element)                      This method is used to insert an element in the queue.
                                                    This method is preferable to add() method since this method does not
                                                    throws an exception when the capacity of the container is full since it returns false.
*/
        //Example

        System.out.println(queue.offer(44));
        System.out.println(queue);

        /*
                Methods                           Description
                ---------------------------------------------------------------------------
                peek()                           This method is used to view the head of queue without removing it.
                                                 It returns Null if the queue is empty.

                Example */

        System.out.println(queue.peek());

        /*
                Methods                           Description
                ---------------------------------------------------------------------------
                poll()                           This method removes and returns the head of the queue.
                                                 It returns null if the queue is empty.

                Example:-
        */
                                        System.out.println(queue.poll());

        /*
                        Methods                           Description
                ---------------------------------------------------------------------------

                remove()                         This method removes and returns the head of the queue.
                                                 It throws NoSuchElementException when the queue is empty.
        */

                                        System.out.println(queue.remove(44));
                                        System.out.println(queue);
               //======================================================================================================

              PriorityQueue<Integer> queue1 = new PriorityQueue<Integer>();
                      for (int i=10; i>0; i--){
                      queue1.add(i) ;
                      }
          /*
                    Queue: Is (Front) 1 2 3 4 5 6 7 8 9 10 (Rear)
                    PriorityQueue Shorted A data For Us
                    Queue (Front) 1 2 3 4 5 6 7 8 9 10 (Rear)     | Shorted the Queue Actual one

                    Peeking:- Obtaining The Head Of Queue
                    Pooling:- Removing The Head Of Queue

           */

                    System.out.println(queue1);
                    System.out.println("Queue Size Is : "+queue1.size());
                    System.out.println("Head Of Queue Is: "+queue1.peek());//Head 1

                    queue1.poll();// Removing Head 1
                    System.out.println("Queue Size After Pooling : "+queue1.size());
                    System.out.println("Head Of Queue Is "+queue1.peek());//new Head 2


    }
}


package Collection_Code.Set;

import java.util.HashSet;
import java.util.Set;

public class SetAll {
    public static void main(String[] args){
        Set<Integer> a = new HashSet<Integer>();
        //a.addAll(Arrays.asList(new Integer[] {1, 3, 2, 4, 8, 9, 0}));
        a.add(1);
        a.add(3);
        a.add(2);
        a.add(4);
        a.add(8);
        a.add(9);
        a.add(0);

        Set<Integer> b = new HashSet<Integer>();
        //b.addAll(Arrays.asList(new Integer[] {1, 3, 7, 5, 4, 0, 7, 5}));

        b.add(1);
        b.add(3);
        b.add(7);
        b.add(5);
        b.add(7);
        b.add(5);
        b.add(0);

        // To find union
        Set<Integer> union = new HashSet<Integer>(a);
        union.addAll(b);
        System.out.print("Union of the two Set");
        System.out.println(union);

        // To find intersection
        Set<Integer> intersection = new HashSet<Integer>(a);
        intersection.retainAll(b);
        System.out.print("Intersection of the two Set");
        System.out.println(intersection);

        // To find the symmetric difference
        Set<Integer> difference = new HashSet<Integer>(a);
        difference.removeAll(b);
        System.out.print("Difference of the two Set");
        System.out.println(difference);

        Set<String> hs
                = new HashSet<String>();

        // Elements are added using add() method
        hs.add("Ram");
        hs.add("Krish");
        hs.add("Rohan");
        hs.add("Kiran");
        hs.add("Dev");
        hs.add("Imran");

        // Iterating though the Set
        for (String value : hs)
            System.out.print(value
                    + ", ");
        System.out.println();

    }
}

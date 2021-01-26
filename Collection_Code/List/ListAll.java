package Collection_Code.List;

import java.util.*;

public class ListAll {
    public static void main(String[] args) {
        //1) Type Safe:-Same Data Type Elements(Object) Added in Collection

        /*
                        ArrayList<String> alist = new ArrayList<>();
        */

        //2) Un type sefe:-Diffrent Data Types Elements(Objects) can be add in collection

        /*
                       LinkedList list =new LinkedList();
        */

        ArrayList<String> alist = new ArrayList<>();
        //All Array List Methods One By One

        //1) add():- To Add Elements In a Array List
        alist.add("Satyam");
        alist.add("Kalyani");
        alist.add("Ritika");
        alist.add("Jagruti");
        alist.add("swara");
        alist.add("Kunal");

        System.out.println(alist);
        //2)add():-If not remove elements but add in index postion you can use add() using index postion ----- that is called Replce
        alist.add(2,"Gayatri");
        System.out.println(alist);

        //3)clear():- Remove All Elements using clear() methos in Array list
        /*alist.clear();
        System.out.println(alist);*/

        //4)size():- a array list find a size in using size() method
        System.out.println(alist.size());

        //5)isEmpty():- isEmpty() method is using for in list elements are Present Or not to give retun value in True And False
        System.out.println(alist.isEmpty());

        //6)contains():- contains() method is find a elements Are Present Or not
        if (alist.contains("Kunal")) {
            System.out.println("===============");
            System.out.println("Kunal Is List");
        }
        System.out.println(alist.contains("Kalyani"));

        //7)get():-if Known Index Postion you can use get() method and find element using Index Postion
        System.out.println(alist.get(4));

        //8)remove(index:postion) Or remove(Object) :- You Can remove the element in using index postion and using directly call Object
        System.out.println(alist.remove(1));
        System.out.println(alist.remove("Ritika"));
        System.out.println(alist);

        //9)set():- Adding a element in index Postion And remove same index elemement in index postion using set() method
        System.out.println(alist.set(0,"Kiran"));
        System.out.println(alist);

        //10)indexOf() or lastIndexOf():- find a elements in using index value and Ojects

        System.out.println(alist.indexOf("Kiran"));
        System.out.println(alist.lastIndexOf("Kunal"));
        //System.out.println(alist);

        //11)addAll():- addAll() method to add Other List Same Elements In Another list

        Vector<String> vr = new Vector<>();
        vr.addAll(alist);
        System.out.println(vr);

        //12)Iterate:- In Array List
        System.out.println("=======Iterating With Enhanced For Loop======");
        for (int i = 0; i<alist.size();i++){
            System.out.println(alist.get(i));
        }

        System.out.println("=======Iterated With Enhanced For Each Loop======");
        for (String Str:alist) {
            System.out.println(Str);
        }
        System.out.println("=========================");

        //13)next() and hasNext():-
        /*
        next():- method is use for in list Element are Present so it Print Next Elements
        hasNext():- Method is Next Elemet Are Paresent his give Return bulean Expresstion

         */
        Iterator<String> it = alist.iterator();{
            System.out.println(it.next());
            System.out.println(it.hasNext());
            }
        System.out.println("========Using While Loop========");
        while (it.hasNext()) {
            String str = it.next();
            System.out.println(str);
        }



        /*LinkedList Int = new LinkedList();
        Int.add(458);
        Int.add("Ram Chandra");

        Iterator it5 = Int.iterator();{
            System.out.println(it5.next());
            System.out.println(it5.hasNext());
        }
        System.out.println("========Using While Loop========");
        while (it5.hasNext()) {
            Object ob = it5.next();
            System.out.println(ob);
        }*/



    }
}

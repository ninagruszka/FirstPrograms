import java.util.*;
public class LinkedListExample {
    public static void main(String args[]) {

        /* deklarujemy linkedlist */
        LinkedList<String> linkedlist = new LinkedList<String>();

        /* tutaj tworzymy elementy naszej listy samochodow */
        linkedlist.add("Fiat");
        linkedlist.add("Autobianchi");
        linkedlist.add("Lancia");
        linkedlist.add("Alfa Romeo");
        linkedlist.add("Vespa");

        /*wypisujemy cala liste*/
        System.out.println("Cars: " +linkedlist);
        System.out.println();

        /*dodajemy pierwszy i ostatni element*/
        linkedlist.addFirst("Ferrari");
        System.out.println("List after first car addition: " + linkedlist);
        linkedlist.addLast("Maserati");
        System.out.println("List after last car addition: " +linkedlist);
        System.out.println();

        /*pobieramy i wyswietlamy pierwszy element listy, podstawiamy w to miejsce inny element*/
        System.out.println("First car: " + linkedlist.get(0));
        System.out.println(linkedlist);
        linkedlist.set(0, "Lambretta"); //tutaj wstawiam Lambrettę w miejsce Ferrari
        System.out.println("First car after change: " + linkedlist.get(0));
        System.out.println("Actual list: " + linkedlist);
        System.out.println();

        /*usuwamy pierwszy i ostatni element*/
        linkedlist.removeFirst();
        System.out.println("After removal of first car " + linkedlist);
        linkedlist.removeLast();
        System.out.println("After removal of last car " +linkedlist);
        System.out.println();

        /*dodawanie elementu o dowolnym indeksie oraz usuwanie elementu o dowolnym indeksie*/
        linkedlist.add(3, "Isetta");
        System.out.println("After addition of Isetta: " + linkedlist);
        linkedlist.remove(2);
        System.out.println("After removal of Lancia: " + linkedlist);
    }
}
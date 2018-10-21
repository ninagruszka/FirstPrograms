
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {

        // deklaruje moja linked list
        ArrayList<String> arraylist = new ArrayList<String>();

        // tworze elementy listy
        arraylist.add("Vespa");
        arraylist.add("Moto Guzzi");
        arraylist.add("Lambretta");
        arraylist.add("Aprilia");

        // wypisuje cala liste
        System.out.println("Motorcycles: " + arraylist);
        System.out.println();

        //dodaje element w srodek listy
        arraylist.add(3, "Piaggio");
        System.out.println("Dodano: " + arraylist.get(3) + " z indeksem 3");
        System.out.println(arraylist.indexOf("Piaggio")); // wyswietlanie numeru indeksu danego elementu
        System.out.println(arraylist);

        // usuwanie elementow na dwa sposoby
        arraylist.remove("Lambretta");
        System.out.println("Usunieto Lambrette: " + arraylist);
        arraylist.remove(1);
        System.out.println("Usunieto element o indeksie 1: " + arraylist);
        System.out.println();

        // ladniejsze wyswietlanie listy - iterowanie
        System.out.println("Lista motocykli:");
        for(String str:arraylist)
            System.out.println(str);
        System.out.println();

        // wielkosc listy
        System.out.println("Rozmiar listy: " + arraylist.size());

        // pytamy czy lista zawiera dane elementy
        System.out.println("Czy lista zawiera element Aprilia?: " + arraylist.contains("Aprilia"));
        System.out.println("Czy lista zawiera element BMW?: " + arraylist.contains("BMW"));
        System.out.println();

        // czyscimy liste i pytamy czy jest pusta
        arraylist.clear();
        System.out.println("Wyczyszczono liste");
        System.out.println("Lista: " + arraylist);
        System.out.println("Czy lista jest pusta?: " + arraylist.isEmpty());


    }

}

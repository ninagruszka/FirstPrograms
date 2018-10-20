public class DodawanieArgWejsciowe {
    public static void main(String[] args) {
        System.out.println("Liczby pobrane z argumentow wejsciowych");
        int pierwsza = Integer.parseInt(args[0]);
        int druga = Integer.parseInt(args[1]);
        System.out.println(pierwsza);
        System.out.println(druga);

        int wynik = pierwsza + druga;

        System.out.println("Wynik dodawania to " + wynik);


    }
}

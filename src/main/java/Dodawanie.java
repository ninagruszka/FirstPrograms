import java.util.Scanner;
public class Dodawanie {
    public static void main(String[] args) {
        System.out.println("Dodawanie liczb calkowitych podanych przez uzytkownika");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj pierwsza liczbe:");
        int pierwsza = scanner.nextInt();
        System.out.print("Podaj druga liczbe:");
        int druga = scanner.nextInt();

        int wynik = pierwsza + druga;

        System.out.println("Wynik to " + wynik);


    }

}

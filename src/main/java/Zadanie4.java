
import java.util.Scanner;

public class Zadanie4 {
    public Zadanie4() {
    }

    public static void main(String[] args) {
        System.out.println("Podaj slowo:");
        Scanner scanner = new Scanner(System.in);
        String tekst = scanner.nextLine();
        int dlugosc = tekst.length();
        System.out.println(dlugosc);

        for(int i = dlugosc - 1; i >= 0; i--) {
            System.out.print(tekst.charAt(i));
        }

    }
}
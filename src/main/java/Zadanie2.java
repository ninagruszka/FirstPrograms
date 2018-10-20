import java.util.Scanner;

public class Zadanie2 {
    public Zadanie2() {
    }

    public static void main(String[] args) {
        System.out.println("Podaj liczbę N:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int suma1 = 0;

        for(int i = 0; i <= n; i += 3) {
            System.out.println(i);
            suma1 += i;
        }

        System.out.println("Suma wielokrotnosci liczby 3 w liczbie " + n + " to " + suma1);
        int suma2 = 0;


        for(int j = 0; j <= n; j += 5) {
            System.out.println(j);
            suma2 += j;
        }

        System.out.println("Suma wielokrotnosci liczby 5 w liczbie " + n + " to " + suma2);
        System.out.println("Calkowita suma to " + (suma1 + suma2));
    }
}

import java.util.Scanner;

public class Zadanie3 {
    public Zadanie3() {
    }

    public static void main(String[] args) {
        System.out.println("Podaj liczbę N:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        long iloczyn = 1L;

        for(int i = 1; i <= n; ++i) {
            iloczyn *= (long)i;
        }

        System.out.println(n + "! = " + iloczyn);
        System.out.println("Teraz inne dzialanie programu - rekurencja:");
        Long wynik = silnia((long)n);
        System.out.println(wynik);
    }

    public static long silnia(long n) {
        return n == 0L ? 1L : silnia(n - 1L) * n;
    }
}

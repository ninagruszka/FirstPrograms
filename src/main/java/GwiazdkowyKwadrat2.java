
import java.util.Scanner;

public class GwiazdkowyKwadrat2 {
    public GwiazdkowyKwadrat2() {
    }

    public static void main(String[] args) {
        System.out.println("Podaj liczbe:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int i;
        for(i = 1; i <= n; ++i) {
            System.out.print("* ");
        }

        System.out.println();

        for(int j = 1; j <= n - 2; ++j) {
            System.out.print("* ");

            for(i = 1; i <= n - 2; ++i) {
                System.out.print("  ");
            }

            System.out.println("* ");
        }

        for(i = 1; i <= n; ++i) {
            System.out.print("* ");
        }

    }
}
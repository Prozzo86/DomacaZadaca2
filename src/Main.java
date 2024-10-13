import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int brojZnamenki = 0;
        int uneseniBroj;

        System.out.println("Unesi neki broj: ");

        uneseniBroj = scanner.nextInt();

        if (uneseniBroj == 0) {
            brojZnamenki = 1;

        } else {

            if (uneseniBroj < 0) {
                uneseniBroj = -uneseniBroj;
            }

            while (uneseniBroj != 0) {
                uneseniBroj /= 10;
                brojZnamenki++;
            }
        }

        System.out.println("Broj znamenki unesenog broja je: " + brojZnamenki);
    }
}
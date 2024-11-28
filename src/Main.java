import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Wprowadź dowolny ciąg znaków: ");
        String tekst = scanner.nextLine();
        String odwrocony = "";
        for (int i = tekst.length() - 1; i >= 0; i--) {
            odwrocony += tekst.charAt(i);
        }
        System.out.println("Odwrócony ciąg: " + odwrocony);
        scanner.close();
    }
}
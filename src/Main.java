import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Lästig");
        blatt1Aufgabe1();
    }


    public static void blatt1Aufgabe1() {
        int n;
        int Ausgabe;
        Scanner scan = new Scanner(System.in);
        System.out.println("Bitte Zahl eingeben: ");
        n = scan.nextInt();
        Ausgabe = n % 17;
        System.out.println("Der Rest bei Division durch 17 ist " + Ausgabe);
        if (Ausgabe == 13) {
            System.out.println("Pechkeks");
        }
    }
}

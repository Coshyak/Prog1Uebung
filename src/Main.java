import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Lästig");
        blatt2Aufgabe1(true,false);
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
    public static void blatt2Aufgabe1() {
        boolean x;
        boolean y;
        boolean z = false;
        Scanner scan = new Scanner(System.in);
        System.out.println("Bitte Wert x eingeben: ");
        x = scan.nextBoolean();
        System.out.println("Bitte Wert y eingeben: ");
        y = scan.nextBoolean();
        if((x == false) && (y == false)){
            z = true;
        }
        if((x == false) && (y == true)){
            z = true;
        }
        if((x == true) && (y == false)){
            z = true;
        }
        if((x == true) && (y == true)){
            z = false;
        }
        System.out.println(z);
    }
    public static void blatt2Aufgabe2() {
      int x;
      int y;
      int max;
      Scanner scan = new Scanner(System.in);
        System.out.println("Bitte einen Wert für x eingeben: ");
        x = scan.nextInt();
        System.out.println("Bitte einen Wert für y eingeben: ");
        y = scan.nextInt();
        if((x > 0) || (y > 0)){
            if(x > y){
              max = x;
            } else{
                max = y;
            }
        } else{
            max = 0;
        }
        System.out.println(max);
    }
    public static void blatt2Aufgabe3(){
        int n;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        for(int i = 1; i <= n; i = i + 2){
            System.out.println(i);
        }
        for(int i = 1; i <= n; i++) {
            System.out.println(i * i);
        }
        for(int i = 1; i <= n; i++) {
            System.out.println(i * 13);
        }
        for(int i = n; i >= 0; i--){
            System.out.println(i);
        }
    }
    public static void blatt2Aufgabe4(){

    }
}


import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Lästig");
        blatt3Aufgabe3();
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
        for(int i = 1; i <= n*2; i = i + 2){
            System.out.println(i);
        }
        for(int i = 1; i <= n; i++) {
            System.out.println(i * i);
        }
        for(int i = 1; i <= n; i++) {
            System.out.println(i * 13);
        }
        for(int i = n; i > 0; i--){
            System.out.println(i);
        }
    }
    public static void blatt2Aufgabe4(){

    }
    public static void blatt3Aufgabe1(){
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s = s.replace("a", "");
        s = s.replace("e", "");
        s = s.replace("i", "");
        s = s.replace("o", "");
        s = s.replace("u", "");
        System.out.println(s);
    }
    public static void blatt3Aufgabe2(){
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s = s.toUpperCase();
        boolean palindrom = false;
        for(int i = 0; i < s.length(); i++){
          if(s.charAt(i) != s.charAt(s.length() -(1 + i))){
              System.out.println("false");
              return;
          } else{
              palindrom = true;
          }
        }
        System.out.println(palindrom);
    }
    public static void blatt3Aufgabe3() {
        Scanner scan = new Scanner(System.in);
        int a, b, c;
        System.out.println("Bitte a eingeben: ");
        a = scan.nextInt();
        System.out.println("Bitte b eingeben: ");
        b = scan.nextInt();
        System.out.println("Bitte c eingeben: ");
        c = scan.nextInt();

        for(int i = 0; i < b; i++){
            for(int j = 0; j < a; j++){
                System.out.print("X ");
            }
            for(int k = 0; k <= c; k++){
                System.out.println();
            }
        }

    }
    public static void blatt3Aufgabe5() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i = 0; i < Math.pow(2, n); i++){
            String binary = Integer.toBinaryString(i);
            for(int k = binary.length(); k < n; k++){
                System.out.print(0);
            }
            System.out.print(binary + " ");
        }
    }

}


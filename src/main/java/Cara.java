import java.util.Scanner;

public class Cara {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Kolik tecek? :)");
        int pocetTecek = sc.nextInt();

        System.out.println("");
        for (int i = 0; i < pocetTecek; i++) {
            System.out.print(".");
        }
    }
}

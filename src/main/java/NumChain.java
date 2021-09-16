import java.util.Scanner;

public class NumChain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String numberString = "";
        numberString = sc.nextLine();

        for (int i = 0; i < numberString.length(); i++) {
            System.out.println(numberString.substring(0, numberString.length() - i));
        }
    }
}

import java.util.Scanner;

public class Bin {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numberDeci = sc.nextInt();
        StringBuilder numberDeciString = new StringBuilder(numberDeci);

        while (numberDeci != 0) {
            numberDeciString.append(numberDeci%2);
            numberDeci = numberDeci / 2;
        }
        System.out.println(numberDeciString.reverse());
    }
}

import java.util.Scanner;

public class Atbas { // cost me 2 years worth of brainpower to create

    public static void main(String[] args) {
        Atbas a = new Atbas();
        Scanner sc = new Scanner(System.in);

        String rawText = sc.nextLine();
        a.encode(rawText);
    }

    public void encode(String rawText) { // convert each char to ascii value and adjust that value to reflect alphabetical mirroring
        StringBuilder cipherText = new StringBuilder();

        for (int i = 0; i < rawText.length(); i++) {
            char x = rawText.charAt(i);
            cipherText.append(getCharFromAscii(getAsciiValueOfChar('z') + getAsciiValueOfChar('a') - getAsciiValueOfChar(x)));
        }
        System.out.println(cipherText);
    }

    public int getAsciiValueOfChar(char character) {
        return (int) character;
    }

    public String getCharFromAscii(int asciiVal) {
        return Character.toString((char) asciiVal);
    }
}

import java.util.Scanner;

public class StringCharArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geef een tekst: ");
        String zin = scanner.nextLine();
        char[] characters = zin.toCharArray();
        for (int i = 0; i < characters.length; i++) {
            if (characters[i] == 'H') {
                characters[i] = 'G';

            } else if (characters[i] == 'G') {
                characters[i] = 'H';
            }
            else if (characters[i] == 'g') {
                characters[i] = 'h';
            System.out.println();}
            else if (characters[i] == 'h') {
                characters[i] = 'g';
            }

        }
        zin = new String(characters);
        System.out.println (zin);
    }

}




import java.util.Scanner;

public class StringFormat2 {
    public static void main(String[] args) {
        Scanner invoer = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {

            System.out.println("Geef een naam: ");
            String naam = invoer.nextLine();
            String resultaat = String.format("Naam: %20s", naam);
            System.out.println(resultaat);

        }

    }
}

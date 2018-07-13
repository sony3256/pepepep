import java.util.Scanner;

public class StringFormat {
    public static void main(String[] args) {
        Scanner invoer = new Scanner(System.in);
        System.out.println("Geef heet eerste getal: ");
        int getal1 = Integer.parseInt(invoer.nextLine());
        System.out.println("Geef het tweede getal: ");
        int getal2 = Integer.parseInt(invoer.nextLine());
        double getal3 = getal1/(double)getal2;
        String resultaat = String.format("%d / %d is %.2f",getal1, getal2, getal3);
        System.out.println(resultaat);

    }
}

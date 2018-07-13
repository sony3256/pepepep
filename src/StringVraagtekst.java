import java.util.Scanner;

public class StringVraagtekst {
    public static void main(String[] args) {
        Scanner invoer = new Scanner(System.in);
        System.out.println("Geef een zin in hoofdletters");
        String tekst = invoer.nextLine();
        tekst = tekst.toUpperCase();
        System.out.println(tekst);

    }
}

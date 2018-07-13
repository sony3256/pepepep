import java.util.Scanner;

public class ReplaceContain {
    public static void main(String[] args) {
        Scanner invoer = new Scanner(System.in);
        String tekst;
        System.out.println("Geef een tekst:");
        tekst = invoer.nextLine();


        do {


            tekst = tekst.replace(" ", "");
            System.out.println("Nieuwe tekst is " + tekst);
        } while (tekst.contains(" "));
        System.out.println("Nieuwe tekst is " + tekst);

        }
        }